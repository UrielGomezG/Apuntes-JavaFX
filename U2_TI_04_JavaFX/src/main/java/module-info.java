module utez.edu.mx.demo {
    requires javafx.controls;
    requires javafx.fxml;

    requires org.controlsfx.controls;
    requires org.kordamp.bootstrapfx.core;

    opens utez.edu.mx.demo to javafx.fxml;
    exports utez.edu.mx.demo;
}