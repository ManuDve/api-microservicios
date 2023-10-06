# Introducción

Proyecto API REST con microservicios desplegados en Eureka Server con Spring Cloud Gateway y Feign Client para la semana 2 del proyecto Eureka

## Prerequisitos de instalación

* Instalar [Spring Boot Tools con Eclipse](https://spring.io/tools)
* Instalar [JDK 11](https://jdk.java.net/java-se-ri/11-MR2)
* Instalar [Postman](https://www.postman.com/downloads/), crear una cuenta e iniciar sesión
* Instalar el plugin [Lombok 1.18.30](https://mvnrepository.com/artifact/org.projectlombok/lombok/1.18.30) en el IDE


## Configuración Inicial

* Clonar el repositorio localmente
* Cargar las dependencias con Maven
* Levantar las intancias en el siguiente orden:
1. springboot-servicio-eureka-server
2. springboot-servicio-organizaciones
3. springboot-servicio-superheroes
4. springboot-servicio-gateway-server

```
git clone https://github.com/ManuDve/superheroes-topsecret.git
```
### Base de Datos
Para visualizar la base de datos, acceder a la consola de la BD H2 en la siguiente URL en un navegador:
```
http://localhost:8080/topsecret-console
```
Acceder con las siguientes credenciales:
```
Driver Class: org.h2.Driver
JDBC URL: jdbc:h2:mem:topsecret-db
user: sa
password: 
```
### Endpoints
Utilizando Postman, se exponen los siguientes endpoints:

#### GET
```
http://localhost:8080/api/superheroes
```
```
http://localhost:8080/api/organizaciones
```

Estos pueden aceptar parámetros por **ID**, por ejemplo:
```
http://localhost:8080/api/organizaciones/1
```
```
http://localhost:8080/api/superheroes/1
```
#### POST

Debe ser realizado con la siguiente estructura **JSON**:

* Organizaciones
```
http://localhost:8080/api/organizaciones
```
```json
{
  "nombre": "X-Men",
  "publico": false,
  "fecha": "1967-07-01"
}
```
```json
{
"nombre": "Fantastic Four",
"publico": true,
"fecha": "1961-11-01"
}
```
* Superhéroes

```
http://localhost:8080/api/superheroes
```

Luego de crear una organización, los superhéroes llevan la ID de la organización a la cual pertenecen:
```json
{
  "alias": "Wolverine",
  "vigencia": true,
  "organizacion": {
    "id": 1
  }
}
```
```json
{
  "alias": "Mister Fantastic",
  "vigencia": false,
  "organizacion": {
    "id": 2
  }
}
```
El parámetro con la ID de la organización es **obligatorio**.

#### DELETE
Debe ser realizado utilizando el número de **ID**, ejemplo:
```
http://localhost:8080/api/superheroes/1
```
Para borrar una organización, primero deben eliminarse los superhéroes que están relacionados a aquella organización
```
http://localhost:8080/api/organizaciones/1
```
