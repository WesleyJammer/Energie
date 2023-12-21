package testenergie.energieopdracht1.Classes;

import java.util.ArrayList;

public class KlantControl {

private ArrayList<Object> klantlijst;
private Integer klantNummer;
private String voorNaam;
private String achterNaam;
private double voorschot;

private double voorschotGas;


    public KlantControl() {
        this.klantlijst = new ArrayList<Object>();
    }
// gegevens uit de arraylist ook daadwerkelijk toevoegen aan de lijst
public void addKlantToList(Integer klantnr, String vNaam, String aNaam, double voorschot, double voorschotGas){

Klant k = new Klant(klantnr, vNaam, aNaam, voorschot, voorschotGas);

klantlijst.add(k);


    }

    public void setKlantData(Integer klantNummer, String voorNaam, String achterNaam, double voorschot, double voorschotGas){

        this.klantNummer = klantNummer;
        this.voorNaam = voorNaam;
        this.achterNaam = achterNaam;
        this.voorschot = voorschot;
        this.voorschotGas= voorschotGas;
        System.out.println("Setting klantNummer: " + klantNummer);


    }




    public Integer getKlantNummer() {

        return klantNummer;
    }

    public String getVoorNaam() {
        return voorNaam;
    }

    public String getAchterNaam() {
        return achterNaam;
    }

    public double getVoorschot() {
        return voorschot;
    }

    public double getVoorschotGas() {return voorschotGas;}

}
