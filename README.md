# Ejercicio 15 - JavaFX

## Descripción

Este proyecto corresponde al ejercicio 15 del bloque BC5 de JavaFX.

El objetivo del ejercicio es crear un botón que, al pulsarlo, muestre un mensaje en la consola indicando que ha sido pulsado.

## Tecnologías utilizadas

- Java
- JavaFX
- Maven
- IntelliJ IDEA

## Funcionamiento

La aplicación muestra una ventana con un botón.

Cuando el usuario pulsa el botón, se ejecuta un evento y aparece el siguiente mensaje en la consola:

```text
El botón ha sido pulsado.
```

## Conceptos utilizados

- `Application`: clase base para crear aplicaciones JavaFX.
- `Stage`: ventana principal de la aplicación.
- `Scene`: contenido visual de la ventana.
- `Button`: control gráfico utilizado para crear botones.
- `setOnAction`: método utilizado para programar la acción del botón.
- `System.out.println`: instrucción utilizada para mostrar mensajes en consola.
- `StackPane`: layout utilizado para centrar el botón en la ventana.

## Estructura del proyecto

```text
Ejercicio15_JavaFX
 ├── pom.xml
 └── src
     └── main
         └── java
             └── org
                 └── example
                     └── Main.java
```

## Cómo ejecutar el proyecto

Para ejecutar el proyecto desde IntelliJ IDEA:

1. Abrir el proyecto en IntelliJ.
2. Sincronizar el archivo `pom.xml` con Maven.
3. Abrir el panel Maven.
4. Ejecutar:

```bash
mvn javafx:run
```

## Autor

Andrés Huéscar Fernández
