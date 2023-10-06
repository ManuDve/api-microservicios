# Introducción

Proyecto API REST con microservicios desplegados en Eureka Server, Spring Cloud Gateway con balanceo de carga y Feign Client. Semana 2 del proyecto Eureka

## Prerequisitos de instalación

- Instalar [Spring Boot Tools con Eclipse](https://spring.io/tools)
- Instalar [JDK 11](https://jdk.java.net/java-se-ri/11-MR2)
- Instalar [Postman](https://www.postman.com/downloads/), crear una cuenta e iniciar sesión
- Instalar el plugin [Lombok 1.18.30](https://mvnrepository.com/artifact/org.projectlombok/lombok/1.18.30) en el IDE
- Instalar [MySSQL 8.0.34 Community Edition con Workbench](https://dev.mysql.com/downloads/mysql/)

## Configuración MySQL

1. Crear credenciales con user:pass = sasa:sasa
2. Crear un nuevo esquema de nombre db_organizaciones

## Configuración Inicial Spring Boot Tools

- Clonar el repositorio localmente

```
git clone https://github.com/ManuDve/superheroes-topsecret.git
```

- Importar Proyecto desde el File System incluyendo todas las carpetas
- Cargar las dependencias con Maven
- Levantar las intancias en el siguiente orden (Run As > Spring Boot App):

1. springboot-servicio-eureka-server
2. springboot-servicio-organizaciones
3. springboot-servicio-superheroes
4. springboot-servicio-gateway-server

### Eureka Server

A través de la siguiente URL se puede acceder al panel de control del Servidor Eureka para revisar las intancias levantadas

```
http://localhost:8761
```

### Endpoints

Utilizando Postman, se exponen los siguientes endpoints a través del Gateway-Sever con puerto 8090

#### GET

```
http://localhost:8090/api/superheroes
```

```
http://localhost:8090/api/organizaciones
```

Estos pueden aceptar parámetros por **ID**, por ejemplo:

```
http://localhost:8090/api/organizaciones/1
```

```
http://localhost:8090/api/superheroes/1
```

#### POST

Debe ser realizado con la siguiente estructura **JSON**:

- Organizaciones

```
http://localhost:8090/api/organizaciones
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

- Superhéroes

```
http://localhost:8090/api/superheroes
```

Luego de crear una organización, los superhéroes llevan la ID de la organización a la cual pertenecen:

```json
{
  "alias": "Wolverine",
  "vigencia": true,
  "organizacion": {
    "id": 2
  }
}
```

```json
{
  "alias": "Mister Fantastic",
  "vigencia": false,
  "organizacion": {
    "id": 3
  }
}
```

El parámetro con la ID de la organización es **obligatorio**.

#### DELETE

Debe ser realizado utilizando el número de **ID**, ejemplo:

```
http://localhost:8090/api/superheroes/1
```

Para borrar una organización, primero deben eliminarse los superhéroes que están relacionados a aquella organización

```
http://localhost:8090/api/organizaciones/1
```
