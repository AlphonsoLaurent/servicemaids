# Etapa 1: Compilar la aplicación con Gradle
FROM gradle:7.6.2-jdk17 AS build

WORKDIR /app

# Copiar archivos de configuración y código fuente
COPY build.gradle settings.gradle ./
COPY src ./src

# Compilar la aplicación
RUN gradle clean bootJar --no-daemon

# Etapa 2: Crear la imagen final con OpenJDK
FROM openjdk:17-jdk-alpine

WORKDIR /app

# Copiar el JAR compilado desde la etapa anterior
COPY --from=build /app/build/libs/*.jar app.jar

# Exponer el puerto 8080
EXPOSE 8080

# Ejecutar la aplicación Spring Boot
ENTRYPOINT ["java", "-jar", "app.jar"]