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
import testenergie.energieopdracht1.views.VulTariefIn;

import java.io.IOException;

public class HelloApplication extends Application {
    @Override
    public void start(Stage stage) throws IOException {



       GridPane root = new GridPane();

        TextField txtKlantNummer = new TextField();
        TextField txtVoorNaam = new TextField();
        TextField txtAchterNaam = new TextField();

        Button btnOpslaan = new Button("Volgende");

        VulTariefIn Tarief = new VulTariefIn(stage);


//
//        btnOpslaan.setOnAction(e -> { if(!validateFields(txtKlantNummer, txtVoorNaam,));
//
//
//
//        });

      root.add(txtKlantNummer, 0, 1);
      root.add(txtVoorNaam, 0, 2);
      root.add(txtAchterNaam, 0, 3);

      root.add(btnOpslaan,0,4);

      //FXMLLoader fxmlLoader = new FXMLLoader(HelloApplication.class.getResource("hello-view.fxml"));
        Scene scene = new Scene(root, 800, 600);
        Scene scene2 = new Scene(Tarief);

        btnOpslaan.setOnAction(e ->{
                stage.setWidth(stage.getWidth());
                stage.setHeight(stage.getHeight());
                stage.setScene(scene2);
                });
        stage.setTitle("Hello!");
        stage.setScene(scene);
        stage.show();
    }


//private boolean validateFields(TextField txtKlantNummer, TextField txtVoorNaam, TextField txtAchterNaam){
//   if (txtKlantNummer)
//}

    public static void main(String[] args) {
        launch();
    }
}

