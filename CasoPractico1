# Caso Práctico 1

Aplicación web para la gestión de un Gimnasio / Centro Fitness, desarrollada con Spring Boot, Spring Data JPA, Thymeleaf y MySQL.

## Funcionalidades

  Gestión de Categorías de Entrenamiento (CRUD completo).
  Gestión de Clases de Entrenamiento (CRUD completo, relacionadas con una Categoría).
  Gestión de Reservas de Clases (CRUD completo, relacionadas con una Clase).
  Formulario de Quejas y Sugerencias (solo interfaz, sin conexión a base de datos).
  Página de inicio promocional con una clase destacada (CrossFit) y un video embebido mediante `<iframe>`.

## Tecnologías

- Java 17
- Spring Boot 3.3.4 (Spring Web, Spring Data JPA, Thymeleaf)
- MySQL
- Maven

## Estructura del proyecto

```
src/main/java/com/fidelitas/gimnasio/
├── domain        -> Entidades: Categoria, Servicio, Reserva
├── repository    -> Interfaces JpaRepository
├── service        -> Interfaces de servicio y sus implementaciones (ServiceImpl)
└── controllers    -> Controladores MVC
```

## Configuración de la base de datos

1. Ejecutar el script `script_gimnasio_fitness.sql` en MySQL. Este script:
   - Crea el usuario `usuario_caso_practico_01` con contraseña `123456`.
   - Crea la base de datos `gimnasio_fitness`.
   - Crea las tablas `categoria`, `servicio` y `reserva`.
   - Inserta datos de prueba.

2. La conexión está configurada en `src/main/resources/application.properties`:

```
spring.datasource.url=jdbc:mysql://localhost:3306/gimnasio_fitness
spring.datasource.username=usuario_caso_practico_01
spring.datasource.password=123456
```

 Ejecución:
La aplicación está configurada para correr en el **puerto 47**.
mvn spring-boot:run

Luego abrir: `http://localhost:47/`

categorias: Listado y CRUD de categorías   
servicios:Listado y CRUD de clases          
reservas:Listado y CRUD de reservas       
contacto:Formulario de quejas y sugerencias  
