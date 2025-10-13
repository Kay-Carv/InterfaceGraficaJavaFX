package br.com.fiap2espa.demo;

import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.VBox;
import javafx.scene.robot.Robot;
import javafx.scene.text.Font;
import javafx.scene.text.FontWeight;
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
        leftMenu.setPadding(new Insets(10));

        Label menuTitle = new Label("Menu");
        Button btnCreate = new Button("Cadastrar");
        Button btnRead = new Button("Listar amigos");
        Button btnUpdate = new Button("Atualizar dados");
        Button btnDelete = new Button("Excluir amigo");
        Button btnExit = new Button("Sair do programa");

        //Instanciando dentro do menu lateral
        leftMenu.getChildren().add(menuTitle);
        leftMenu.getChildren().addAll( // .addAll para adicionar todos
                btnCreate,
                btnRead,
                btnUpdate,
                btnDelete,
                btnExit);

        //Modificando tamanho dos botões
        menuTitle.setPrefSize(40, 20);
        menuTitle.setAlignment(Pos.CENTER);
        menuTitle.setFont(Font.font("Verdana", FontWeight.BOLD, 13));
        btnCreate.setPrefSize(120, 33);
        btnRead.setPrefSize(120, 33);
        btnUpdate.setPrefSize(120, 33);
        btnDelete.setPrefSize(120, 33);
        btnExit.setPrefSize(120, 33);

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
