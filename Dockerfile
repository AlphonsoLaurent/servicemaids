# Etapa 1: Compilar la aplicación usando Maven
FROM maven:3.8.7-openjdk-17 AS build

# Establecer el directorio de trabajo dentro del contenedor
WORKDIR /app

# Copiar el archivo pom.xml y las dependencias para instalarlas
COPY pom.xml .
RUN mvn dependency:go-offline -B

# Copiar el código fuente al contenedor
COPY src ./src

# Compilar la aplicación Spring Boot
RUN mvn clean package -DskipTests

# Etapa 2: Crear la imagen final con OpenJDK
FROM openjdk:17-jdk-alpine

# Establecer el directorio de trabajo dentro del contenedor
WORKDIR /app

# Copiar el JAR compilado desde la etapa anterior
COPY --from=build /app/target/*.jar app.jar

# Exponer el puerto de la aplicación
EXPOSE 8080

# Comando de inicio para ejecutar la aplicación
ENTRYPOINT ["java", "-jar", "app.jar"]
