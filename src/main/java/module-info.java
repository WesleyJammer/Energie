module testenergie.energieopdracht1 {
    requires javafx.controls;
    requires javafx.fxml;


    opens testenergie.energieopdracht1 to javafx.fxml;
    exports testenergie.energieopdracht1;
}