package testenergie.energieopdracht1.views;

import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Alert;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.GridPane;
import javafx.scene.text.Text;
import javafx.stage.Stage;
import testenergie.energieopdracht1.Classes.KlantControl;
import testenergie.energieopdracht1.Classes.VerbruikControl;

public class VulTariefIn extends Parent {

// prive variabele aanmaken van klantcontrol class en die een naam geven zodat gegevens van die class gebruikt kunnen worden in deze scene
private KlantControl showKlant;
//prive variabele aanmaken van Verbruikcontrol class en die een naam geven zodat gegevens van die class gebruikt kunnen worden in deze scene
private VerbruikControl prijs;
    public VulTariefIn(Stage stage, KlantControl showKlant){

        // verwijzen naar het huidige object showKlant
        this.showKlant = showKlant;

        prijs = new VerbruikControl();


// label aanmaken
        Label tarief = new Label("Tarief");
        // label stijlen
        tarief.setStyle("-fx-font-size: 24; -fx-font-weight: Bold");


        GridPane root = new GridPane();
        TextField txtTarStroom = new TextField();
        TextField txtTarGas = new TextField();



        Button btnVerbruik = new Button("Ga naar verbruik");
// label voor klantinfo aanmaken
        Label klantInfo = new Label();
        klantInfo.setStyle("-fx-font-size: 20; -fx-font-weight: Bold; -fx-text-fill: Brown");

// gegevens die in scene 1 worden ingevuld op scherm zetten in scene 2 doormiddel van hierboven aangemaakt label
        klantInfo.setText("Klant nummer: " + showKlant.getKlantNummer() + ", \nVoor Naam:"
                + showKlant.getVoorNaam() + ", \nAchternaam:" + showKlant.getAchterNaam() +
                ", \nVoorschot Stroom:" + showKlant.getVoorschot() + ",\nVoorschot Gas: " + showKlant.getVoorschotGas() );

        root.add(tarief,0,0);

        root.add(txtTarStroom,0,1);
        root.add(txtTarGas,0,2 );

        root.add(btnVerbruik,0,3);

        root.add(klantInfo,2,5);


     this.getChildren().add(root);



        setupBtnVerbruikAction(btnVerbruik, stage, txtTarStroom, txtTarGas, showKlant, prijs);


    }

    // prive methode aanmaken voor de set on action methode en daarbij verschillende gegevens meegeven
    private void setupBtnVerbruikAction(Button btnVerbruik, Stage stage, TextField txtTarStroom, TextField txtTarGas, KlantControl showKlant, VerbruikControl prijs){
        btnVerbruik.setOnAction(e -> {


            String tarStroom = txtTarStroom.getText();
            String tarGas = txtTarGas.getText();

            if (tarStroom.isEmpty()||tarGas.isEmpty()){

                Alert alert = new Alert(Alert.AlertType.WARNING);
                alert.setTitle("Warning");
                alert.setHeaderText(null);
                alert.setContentText("Vul alle velden in");
                alert.showAndWait();
                return;
            }


            double tarStroomDouble = Double.parseDouble(tarStroom);
            double tarGasDouble = Double.parseDouble(tarGas);
            prijs.setTarief(tarStroomDouble,tarGasDouble);


            VulVerbruikIn thirdScene = new VulVerbruikIn(stage, showKlant, prijs);
            Scene scene3 = new Scene(thirdScene, stage.getWidth(), stage.getHeight());


            stage.setScene(scene3);
        });
    }


    @Override
    public Node getStyleableNode() {
        return super.getStyleableNode();
    }


}
