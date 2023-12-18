package testenergie.energieopdracht1.Classes;

import java.util.ArrayList;

public class KlantControl {

private ArrayList<Object> klantlijst;
private Integer klantNummer;
private String voorNaam;
private String achterNaam;
private double voorschot;


    public KlantControl() {
        this.klantlijst = new ArrayList<Object>();
    }

public void addKlantToList(Integer klantnr, String vNaam, String aNaam, double voorschot){

Klant k = new Klant(klantnr, vNaam, aNaam, voorschot);

klantlijst.add(k);


    }

    public void setKlantData(Integer klantNummer, String voorNaam, String achterNaam, double voorschot){

        this.klantNummer = klantNummer;
        this.voorNaam = voorNaam;
        this.achterNaam = achterNaam;
        this.voorschot = voorschot;
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


}
