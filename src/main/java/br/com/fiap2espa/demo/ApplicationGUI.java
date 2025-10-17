package br.com.fiap2espa.demo;

import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.scene.image.Image;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.Region;
import javafx.scene.layout.StackPane;
import javafx.scene.layout.VBox;
import javafx.scene.robot.Robot;
import javafx.scene.text.Font;
import javafx.scene.text.FontWeight;
import javafx.stage.Stage;

import java.util.Date;
import java.util.Objects;

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

        Label firstInfo = new Label("Escolha a opção do menu: ");
        StackPane contentArea = new StackPane(firstInfo);

        //Função dos botões
        btnCreate.setOnAction(e -> contentArea.getChildren().setAll(getRegisterForm()));
        btnExit.setOnAction(e -> stage.close());


        root.setLeft(leftMenu);
        root.setCenter(contentArea);

        //Modificando tamanho dos botões
        menuTitle.setPrefSize(40, 20);
        menuTitle.setAlignment(Pos.CENTER);
        menuTitle.setFont(Font.font("Verdana", FontWeight.BOLD, 13));
        btnCreate.setPrefSize(120, 33);
        btnRead.setPrefSize(120, 33);
        btnUpdate.setPrefSize(120, 33);
        btnDelete.setPrefSize(120, 33);
        btnExit.setPrefSize(120, 33);


        //Imagem title
        //Image icon = new Image(Objects.requireNonNull(getClass().getResourceAsStream("static/img/friends.png")));


        root.setLeft(leftMenu);

        //Criando uma cena
        Scene scene = new Scene(root, 600, 400);
        stage.setScene(scene);

    }


    private VBox getRegisterForm() {
        VBox vBox = new VBox(10);
        vBox.setPadding((new Insets(10)));

        Label lbTitle = new Label("Cadastrar");
        TextField tfFirstName = new TextField();
        tfFirstName.setPromptText("Nome");
        lbTitle.setAlignment(Pos.CENTER);
        lbTitle.setFont(Font.font("Verdana", FontWeight.BOLD, 20));

        TextField tfSurName = new TextField("Sobrenome");
        tfSurName.setPromptText("Sobrenome");

        ComboBox<String> cbGender = new ComboBox<>();
        cbGender.getItems().addAll("Masculino", "Feminino", "Outros");
        cbGender.setPromptText("Gênero");
        cbGender.setPrefSize(Double.MAX_VALUE, 0);

        DatePicker dpBirtDate = new DatePicker();
        dpBirtDate.setPromptText("Data de nascimento");
        dpBirtDate.setPrefSize(Double.MAX_VALUE, 0);

        Button btnSave = new Button("Salvar");
        btnSave.setPrefSize(Double.MAX_VALUE, 50);
        btnSave.setOnAction( e -> showAlert("Sucesso", "Cadastro realizado (Simulação)!"));

        //Padding/Espaços entre os elementos
        Region spacer1 = new Region();
        spacer1.setMinHeight(15);


        vBox.getChildren().addAll(lbTitle, tfFirstName, tfSurName, cbGender, dpBirtDate, spacer1, btnSave);

        return vBox;
    }

    private void showAlert(String title, String message) {
        Alert alert = new Alert(Alert.AlertType.INFORMATION);
        alert.setHeaderText(title);
        alert.setContentText(message);
        alert.showAndWait();

    }

    //Classe driver para rodar a interface
    public static void main(String[] args) {
        launch();
    }
}
