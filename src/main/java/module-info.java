module edu.cue.proyectofinal {
    requires javafx.controls;
    requires javafx.fxml;
    requires javafx.web;

    requires org.controlsfx.controls;
    requires com.dlsc.formsfx;
    requires net.synedra.validatorfx;
    requires org.kordamp.ikonli.javafx;
    requires org.kordamp.bootstrapfx.core;
    requires eu.hansolo.tilesfx;
    requires com.almasb.fxgl.all;

    opens edu.cue.proyectofinal to javafx.fxml;
    exports edu.cue.proyectofinal.app;
    opens edu.cue.proyectofinal.app to javafx.fxml;
    exports edu.cue.proyectofinal.app.serviceAdmin;
    opens edu.cue.proyectofinal.app.serviceAdmin to javafx.fxml;
}