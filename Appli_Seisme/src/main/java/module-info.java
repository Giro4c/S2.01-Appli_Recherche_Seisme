module com.example.appli_seisme {
    requires javafx.controls;
    requires javafx.fxml;

    requires org.controlsfx.controls;
    requires com.dlsc.formsfx;

    opens com.example.appli_seisme to javafx.fxml;
    exports com.example.appli_seisme;
}