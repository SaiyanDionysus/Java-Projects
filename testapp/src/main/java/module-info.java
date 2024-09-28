module org.example.testapp {
    requires javafx.controls;
    requires javafx.fxml;

    requires org.controlsfx.controls;
    requires org.kordamp.bootstrapfx.core;

    opens org.example.testapp to javafx.fxml;
    exports org.example.testapp;
}