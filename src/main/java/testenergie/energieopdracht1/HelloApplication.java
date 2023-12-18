package testenergie.energieopdracht1;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.ComboBox;
import javafx.scene.control.TextField;
import javafx.scene.layout.GridPane;
import javafx.scene.text.Text;
import javafx.stage.Stage;
import testenergie.energieopdracht1.Classes.KlantControl;
import testenergie.energieopdracht1.views.VulTariefIn;

import java.io.IOException;

public class HelloApplication extends Application {
    private KlantControl klantControl;

    @Override
    public void start(Stage stage) throws IOException {

        klantControl = new KlantControl();

        GridPane root = new GridPane();

        TextField txtKlantNummer = new TextField();
        txtKlantNummer.setPromptText("Klantnummer");
        TextField txtVoorNaam = new TextField();
        txtVoorNaam.setPromptText("Voornaam");
        TextField txtAchterNaam = new TextField();
        txtAchterNaam.setPromptText("Achternaam");
        TextField txtVoorschot = new TextField();
        txtVoorschot.setPromptText("Voorschot");

        Button btnOpslaan = new Button("Volgende");





        root.add(txtKlantNummer, 0, 1);
        root.add(txtVoorNaam, 0, 2);
        root.add(txtAchterNaam, 0, 3);
        root.add(txtVoorschot, 0, 4);

        root.add(btnOpslaan, 0, 5);

        //FXMLLoader fxmlLoader = new FXMLLoader(HelloApplication.class.getResource("hello-view.fxml"));
        Scene scene = new Scene(root, 800, 600);


        btnOpslaan.setOnAction(e -> {

            String klantNummer = txtKlantNummer.getText();
            int klantNummerInt = Integer.parseInt(klantNummer);
            String voorschot = txtVoorschot.getText();
            double voorschotDouble = Double.parseDouble(voorschot);
            klantControl.setKlantData(klantNummerInt, txtVoorNaam.getText(), txtAchterNaam.getText(), voorschotDouble);

            VulTariefIn Tarief = new VulTariefIn(stage, klantControl);

            Scene scene2 = new Scene(Tarief);
            stage.setWidth(stage.getWidth());
            stage.setHeight(stage.getHeight());
            stage.setScene(scene2);
        });


        stage.setTitle("Hello!");
        stage.setScene(scene);
        stage.show();
    }


    public static void main(String[] args) {
        launch();
    }
}

