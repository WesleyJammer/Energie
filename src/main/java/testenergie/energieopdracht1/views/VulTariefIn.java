package testenergie.energieopdracht1.views;

import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.GridPane;
import javafx.scene.text.Text;
import javafx.stage.Stage;

public class VulTariefIn extends Parent {
private GridPane root;
    public VulTariefIn(Stage stage){

        Label tarief = new Label("Tarief");
        tarief.setStyle("-fx-font-size: 24; -fx-font-weight: Bold");


        GridPane root = new GridPane();
        TextField tarStroom = new TextField();
        TextField tarGas = new TextField();

        root.add(tarief,0,0);

        Button btnVerbruik = new Button("Ga naar verbruik");

        root.add(tarStroom,0,1);
        root.add(tarGas,0,2 );

        root.add(btnVerbruik,0,3);


     this.getChildren().add(root);



        setupBtnVerbruikAction(btnVerbruik, stage);

    }

    private void setupBtnVerbruikAction(Button btnVerbruik, Stage stage){
        btnVerbruik.setOnAction(e -> {
            VulVerbruikIn thirdScene = new VulVerbruikIn(stage);
            Scene scene3 = new Scene(thirdScene, stage.getWidth(), stage.getHeight());

            stage.setScene(scene3);
        });
    }


    @Override
    public Node getStyleableNode() {
        return super.getStyleableNode();
    }


}
