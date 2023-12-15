package testenergie.energieopdracht1.views;

import javafx.scene.Parent;
import javafx.scene.control.Button;
import javafx.scene.control.ComboBox;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.GridPane;
import javafx.stage.Stage;

public class VulVerbruikIn extends Parent {


    public VulVerbruikIn(Stage stage){
        super();


        GridPane root = new GridPane();

        Label verbruik = new Label("Verbruik");
        verbruik.setStyle("-fx-font-weight: 25;-fx-font-weight: Bold");

        String[] weeks = new String[52];
        for (int i = 0; i < 52; i++) {
            weeks[i] = "Week " + (i + 1);
        }

        ComboBox<String> weekComboBox = new ComboBox<>();
        weekComboBox.getItems().addAll(weeks);

        weekComboBox.getSelectionModel().selectFirst();

        TextField vulVerbruikin = new TextField();

        Button btnBereken = new Button("Bereken Totaal");

        root.add(verbruik,0,0);

        root.add(weekComboBox, 0, 1);

        root.add(vulVerbruikin,0,2);

        root.add(btnBereken,0,3);
        this.getChildren().add(root);












    }











}
