package testenergie.energieopdracht1.views;

import javafx.scene.Parent;
import javafx.scene.control.*;
import javafx.scene.layout.GridPane;
import javafx.scene.control.Alert;
import javafx.stage.Stage;
import testenergie.energieopdracht1.Classes.KlantControl;
import testenergie.energieopdracht1.Classes.VerbruikControl;

import java.util.HashMap;
import java.util.Map;

public class VulVerbruikIn extends Parent {

    private VerbruikControl prijs;

    // map aanmaken voor het totaal bedrag van gas. zo weet het systeem over welk totaal bedrag het gaat
    private Map<String, Double> totaalStroom = new HashMap<>();
    private Map<String, Double> totaalGas = new HashMap<>();
    public VulVerbruikIn(Stage stage, KlantControl showKlant, VerbruikControl prijs){
        super();

        this.prijs = prijs;


        GridPane root = new GridPane();

        Label verbruik = new Label("Verbruik");
        verbruik.setStyle("-fx-font-size: 25;-fx-font-weight: Bold;");

 // een loop aanmaken om 52 weken toe te voegen aan de combobox;
        String[] weeks = new String[52];
        for (int i = 0; i < 52; i++) {
            weeks[i] = "Week " + (i + 1);
        }
// combo box defineren als nieuw object van de class Combbox
        ComboBox<String> weekComboBox = new ComboBox<>();
        // zorgen dat ook alle weken worden toegevoegd aan de combo box
        weekComboBox.getItems().addAll(weeks);
// alvast een item selecteren in de combobox
        weekComboBox.getSelectionModel().selectFirst();

        // actie om week te selecteren in de combobox
        weekComboBox.setOnAction(e -> {
            String selectedWeek = weekComboBox.getValue();
            // Perform some action with the selected week
            System.out.println("You selected: " + selectedWeek);

        });

        TextField vulVerbruikin = new TextField();
        vulVerbruikin.setPromptText("Verbruik Stroom");
        TextField vulVerbruikinGas = new TextField();
        vulVerbruikinGas.setPromptText("Verbruik Gas");

        Button btnBereken = new Button("Bereken Totaal");



        Label klantInfo2 = new Label();
        klantInfo2.setStyle("-fx-text-fill: brown; -fx-font-size: 18;-fx-font-weight: Bold");
        klantInfo2.setText("Klant nummer: " + showKlant.getKlantNummer() + ", \nVoor Naam:"
                + showKlant.getVoorNaam() + ", \nAchternaam:" + showKlant.getAchterNaam() +
                ", \nVoorschot Stroom:" + showKlant.getVoorschot() + ",\nVoorschot Gas: " + showKlant.getVoorschotGas() + ",\nTarief Stroom:" + prijs.getTarStroom() + ", \nTarief Gas:" + prijs.getTarGas());

// Label aanmaken voor totaal bedragen
        Label totaalStroomLabel = new Label("Totaal Stroom: 0 ");
        Label totaalGasLabel = new Label("Totaal Gas: 0 ");
        root.add(verbruik,0,0);

        root.add(weekComboBox, 0, 1);

        root.add(vulVerbruikin,0,2);
        root.add(vulVerbruikinGas, 0, 3);

        root.add(btnBereken,0,4);
        ;


        root.add(klantInfo2, 2, 6);

        root.add(totaalStroomLabel, 3,6);
        root.add(totaalGasLabel,3,7);

        this.getChildren().add(root);

        btnBereken.setOnAction(e->{

        String stroomConsumptie = vulVerbruikin.getText();
        String gasConsumptie = vulVerbruikinGas.getText();


            if (stroomConsumptie.isEmpty() || gasConsumptie.isEmpty()) {

                Alert alert = new Alert(Alert.AlertType.WARNING);
                alert.setTitle("Warning");
                alert.setHeaderText(null);
                alert.setContentText("Vul alle velden in");

                alert.showAndWait();
                return;
            }

            double stroomConsumptieDouble = Double.parseDouble(stroomConsumptie);
            double gasConsumptieDouble = Double.parseDouble(gasConsumptie);

// methode om de berekingen te maken ivm het verbruik per week maal de prijs van stroom of gas
        double stroomprijs = stroomConsumptieDouble * prijs.getTarStroom();
        double gasprijs = gasConsumptieDouble * prijs.getTarGas();
// zorgen dat ook daadwerkelijk de juiste week word geselecteerd en er niet meerdere keren een bedrag in de zelfde week kan worden ingevuld
        String selectedWeek = weekComboBox.getValue();
        totaalStroom.put(selectedWeek,stroomprijs);
        totaalGas.put(selectedWeek,gasprijs);

        totaalStroomLabel.setText("Totaal Stroom:" + totaalStroom.values().stream().mapToDouble(Double::doubleValue).sum());
        totaalGasLabel.setText("Totaal Gas:" + totaalGas.values().stream().mapToDouble(Double::doubleValue).sum());

        // zorgen dat totaal bedrag rood kleurt wanneer het totaal bedrag de voorschot overscheid
       double totaleBetalingStroom = 0;
       for (Double betaling : totaalStroom.values()){

           totaleBetalingStroom += betaling;
       }

       if (totaleBetalingStroom > showKlant.getVoorschot()){
           totaalStroomLabel.setStyle("-fx-text-fill: red");
       } else {
           totaalStroomLabel.setStyle("-fx-text-fill: black");
       }

       double totaalBetalingGas = 0;

       for(Double betaling : totaalGas.values()) {

           totaalBetalingGas += betaling;
       }

       if (totaalBetalingGas > showKlant.getVoorschotGas()){

           totaalGasLabel.setStyle("-fx-text-fill: red");
       } else {

           totaalGasLabel.setStyle("-fx-text-fill: black");
       }






        });












    }











}
