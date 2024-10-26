# Etapa 1: Construir la aplicación con Gradle y OpenJDK
FROM gradle:7.6.2-jdk17 AS build

# Establecer el directorio de trabajo
WORKDIR /app

# Copiar solo los archivos necesarios para descargar las dependencias
COPY build.gradle settings.gradle ./
RUN gradle build --no-daemon --parallel --refresh-dependencies

# Copiar todo el proyecto
COPY . .

# Ejecutar la construcción final del JAR
RUN gradle clean bootJar --no-daemon

# Etapa 2: Crear la imagen final con OpenJDK para ejecutar la aplicación
FROM openjdk:17-jdk-alpine

# Establecer el directorio de trabajo
WORKDIR /app

# Copiar el JAR compilado desde la etapa de construcción
COPY --from=build /app/build/libs/*.jar app.jar

# Exponer el puerto 8080
EXPOSE 8080

# Ejecutar la aplicación Spring Boot
ENTRYPOINT ["java", "-jar", "app.jar"]
