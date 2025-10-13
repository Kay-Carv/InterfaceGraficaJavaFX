package br.com.fiap2espa.demo;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

public class ApplicationGUI extends Application {
    //Método obrigatório para trabalhar com interface
    @Override
    public void start(Stage stage) throws Exception {
        stage.show();
        stage.setTitle("Título teste");

        //Painel raiz
        BorderPane root = new BorderPane();

        //
        VBox leftMenu = new VBox(20); //spacing 20 -> margin base

        Label menuTitle = new Label("Menu");
        Button btn = new Button("Clique aqui");

        //Instanciando dentro do menu lateral
        leftMenu.getChildren().add(menuTitle);
        leftMenu.getChildren().add(btn);

        root.setLeft(leftMenu);

        //Criando uma cena
        Scene scene = new Scene(root, 600, 400);
        stage.setScene(scene);

    }


    //Classe driver para rodar a interface
    public static void main(String[] args) {
        launch();
    }
}
