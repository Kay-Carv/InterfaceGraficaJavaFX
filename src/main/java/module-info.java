module br.com.fiap2espa.demo {
    requires javafx.controls;
    requires javafx.fxml;


    opens br.com.fiap2espa.demo to javafx.fxml;
    exports br.com.fiap2espa.demo;
}
