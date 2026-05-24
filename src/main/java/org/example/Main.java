package org.example;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.StackPane;
import javafx.stage.Stage;

public class Main extends Application {

    @Override
    public void start(Stage stage) {

        // Creo un botón que el usuario podrá pulsar
        Button boton = new Button("Pulsar botón");

        // Evento que se ejecuta cuando se pulsa el botón
        boton.setOnAction(event -> {
            System.out.println("El botón ha sido pulsado.");
        });

        // StackPane coloca el botón en el centro de la ventana
        StackPane root = new StackPane();
        root.getChildren().add(boton);

        // Aplico un estilo sencillo para mejorar la presentación
        root.setStyle("-fx-padding: 20;");

        // Creo la escena principal
        Scene scene = new Scene(root, 400, 220);

        // Configuro y muestro la ventana
        stage.setTitle("Ejercicio 15 - JavaFX");
        stage.setScene(scene);
        stage.show();
    }

    public static void main(String[] args) {
        launch();
    }
}