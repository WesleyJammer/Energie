package testenergie.energieopdracht1.views;

import javafx.scene.Parent;
import javafx.scene.control.Button;
import javafx.scene.control.ComboBox;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.GridPane;
import javafx.stage.Stage;
import testenergie.energieopdracht1.Classes.KlantControl;
import testenergie.energieopdracht1.Classes.VerbruikControl;

public class VulVerbruikIn extends Parent {

    private VerbruikControl prijs;

    public VulVerbruikIn(Stage stage, KlantControl showKlant, VerbruikControl prijs){
        super();

        this.prijs = prijs;


        GridPane root = new GridPane();

        Label verbruik = new Label("Verbruik");
        verbruik.setStyle("-fx-font-size: 25;-fx-font-weight: Bold;");

        String[] weeks = new String[52];
        for (int i = 0; i < 52; i++) {
            weeks[i] = "Week " + (i + 1);
        }

        ComboBox<String> weekComboBox = new ComboBox<>();
        weekComboBox.getItems().addAll(weeks);

        weekComboBox.getSelectionModel().selectFirst();

        weekComboBox.setOnAction(event -> {
            String selectedWeek = weekComboBox.getValue();
            // Perform some action with the selected week
            System.out.println("You selected: " + selectedWeek);
        });

        TextField vulVerbruikin = new TextField();

        Button btnBereken = new Button("Bereken Totaal");

        Label klantInfo2 = new Label();
        klantInfo2.setStyle("-fx-text-fill: brown; -fx-font-size: 18;-fx-font-weight: Bold");
        klantInfo2.setText("Klant nummer: " + showKlant.getKlantNummer() + ", \nVoor Naam:"
                + showKlant.getVoorNaam() + ", \nAchternaam:" + showKlant.getAchterNaam() +
                ", \nVoorschot:" + showKlant.getVoorschot() + ",\nTarief Stroom:" + prijs.getTarStroom() + ", \nTarief Gas:" + prijs.getTarGas());

        root.add(verbruik,0,0);

        root.add(weekComboBox, 0, 1);

        root.add(vulVerbruikin,0,2);

        root.add(btnBereken,0,3);

        root.add(klantInfo2, 2, 5);
        this.getChildren().add(root);












    }











}
