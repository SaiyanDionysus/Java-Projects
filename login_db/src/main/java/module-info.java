module org.example.login_db {
    requires javafx.controls;
    requires javafx.fxml;

    requires org.kordamp.bootstrapfx.core;

    opens org.example.login_db to javafx.fxml;
    exports org.example.login_db;
}