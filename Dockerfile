# COMPILAMOS LA APLICACIÓN
## UN MULTISTAGE HACE QUE LA APLICACIÓN EN EL .JAR SEA MÁS PEQUEÑA. LO DE ABAJO ES UNA MÁQUINA QUE TIENE MVN INSTALADO.
FROM maven:3.9-eclipse-temurin-21 AS build
## CREAMOS UN DIRECTORIO PARA DEJAR LA APLICACIÓN
WORKDIR /app

## LE PASAMOS LAS DEPENDENCIAS Y EL CÓDIGO FUENTE.
COPY pom.xml .
COPY src ./src

# Este comando se ejecuta al crear la imágen e ignora procesos de testing ./test/
RUN mvn clean package -DskipTests

# Cuando llegamos a este proceso la máquina anterior se borra (la que compila)
# EJECUTAMOS LA APLICACIÓN YA TENIENDO EL .JAR EN /TARGET
FROM eclipse-temurin:21-jre
WORKDIR /app

# COPIAMOS EL .JAR GENERADO DE LA COMPILACIÓN ANTERIOR
COPY --from=build /app/target/*.jar app.jar

EXPOSE 8080

# ESTE OTRO, A DIFERENCIA DE RUN. SE EJECUTA CUANDO EJECUTAS EL CONTENEDOR (ENTRYPOINT)
ENTRYPOINT ["java", "-jar", "app.jar"]


