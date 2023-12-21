package testenergie.energieopdracht1;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.control.Alert;
import javafx.scene.control.Button;
import javafx.scene.control.ComboBox;
import javafx.scene.control.TextField;
import javafx.scene.layout.GridPane;
import javafx.scene.text.Text;
import javafx.stage.Stage;
import testenergie.energieopdracht1.Classes.KlantControl;
import testenergie.energieopdracht1.views.VulTariefIn;

import java.io.IOException;


//class van de hoofd applicatie
public class HelloApplication extends Application {
    // prive object van de clas Klant control
    private KlantControl klantControl;

    @Override
    //stage 1 meegeven aan de helloaplicatie
    public void start(Stage stage) throws IOException {

        //Klantcontrol class een naam geven zodat hij in deze scene aangesproken kan worden
        klantControl = new KlantControl();

        // gridpane maken voor de layout.
        GridPane root = new GridPane();

        // text velden toevoegen
        TextField txtKlantNummer = new TextField();
        // een placeholder text instellen
        txtKlantNummer.setPromptText("Klantnummer");
        TextField txtVoorNaam = new TextField();
        txtVoorNaam.setPromptText("Voornaam");
        TextField txtAchterNaam = new TextField();
        txtAchterNaam.setPromptText("Achternaam");
        TextField txtVoorschot = new TextField();
        txtVoorschot.setPromptText("Voorschot Stroom");
        TextField txtVoorSchotGas = new TextField();
        txtVoorSchotGas.setPromptText("Voorschot Gas");

        // knop aanmaken waarmee ik naar de volgende scene kan en die de ingevoerde gegevens opslaat een mee neemt
        Button btnOpslaan = new Button("Volgende");




// textvelden en knoppen toevoegen aan de gridpane
        root.add(txtKlantNummer, 0, 1);
        root.add(txtVoorNaam, 0, 2);
        root.add(txtAchterNaam, 0, 3);
        root.add(txtVoorschot, 0, 4);
        root.add(txtVoorSchotGas,0, 5);

        root.add(btnOpslaan, 0, 6);

      //scene aanmaken zodat alles weergeven kan worden, inc hoogte en breedte van het beeld
        Scene scene = new Scene(root, 800, 600);

// acties toevoegen aan de button
        btnOpslaan.setOnAction(e -> {
// textvelden ophalen en een naam geven
            String klantNummer = txtKlantNummer.getText();
            String voorNaam = txtVoorNaam.getText();
            String achterNaam = txtAchterNaam.getText();
            String voorschot = txtVoorschot.getText();
            String voorschotGas = txtVoorSchotGas.getText();

            // een alert aanmaken voor als tekst velden niet ingevuld zijn
            if(klantNummer.isEmpty()||voorNaam.isEmpty()||achterNaam.isEmpty()||voorschot.isEmpty()||voorschotGas.isEmpty()){

                Alert alert = new Alert(Alert.AlertType.WARNING);
                alert.setTitle("Warning");
                alert.setHeaderText(null);
                alert.setContentText("Vul alle velden in");

                alert.showAndWait();
                return;

            }



// bepaalde tekstvelden omzetten naar een int of een double zodat er cijfers ingevoerd kunnen worden
            int klantNummerInt = Integer.parseInt(klantNummer);
            double voorschotDouble = Double.parseDouble(voorschot);
            double voorschotGasDouble = Double.parseDouble(voorschotGas);

            // klant control class koppelen aan tekstvelden en de waardes daarvan vastzetten voor de volgende scene
            klantControl.setKlantData(klantNummerInt, txtVoorNaam.getText(), txtAchterNaam.getText(), voorschotDouble, voorschotGasDouble);

// nieuw object aanmaken van Vultariefin class en daarbij de stage en class klantcontrol meegeven. hierdoor kan je van scene 1 naar 2 gaan doormiddel van de knop
            VulTariefIn Tarief = new VulTariefIn(stage, klantControl);

            //scene 2 aanmaken
            Scene scene2 = new Scene(Tarief);
            //breedte en hoogte zelfde waardes geven als deze scene
            stage.setWidth(stage.getWidth());
            stage.setHeight(stage.getHeight());
            //scene 2 ook daadwerkelijk neerzetten
            stage.setScene(scene2);
        });


        stage.setTitle("Hello!");
        stage.setScene(scene);
        // de stage waar de scenes inzitten ook daadwerkelijk weergeven.
        stage.show();
    }


    public static void main(String[] args) {
        launch();
    }
}

