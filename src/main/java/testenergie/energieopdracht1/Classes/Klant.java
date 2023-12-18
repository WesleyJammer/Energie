package testenergie.energieopdracht1.Classes;

public class Klant {


    private Integer klantnr;
    private String vNaam;
    private String aNaam;
    private double voorschot;

    public Klant(Integer klantnr, String vNaam, String aNaam, double voorschot) {
        this.klantnr = this.klantnr;
        this.vNaam = this.vNaam;
        this.aNaam = this.aNaam;
        this.voorschot = this.voorschot;
    }

    public Integer getKlantnr(Integer klantnr, String vNaam, String aNaam, double voorschot ) {
        return klantnr;
    }

    public void setKlantnr(Integer klantnr) {
        this.klantnr = klantnr;
    }

    public String getvNaam() {
        return vNaam;
    }

    public void setvNaam(String vNaam) {
        this.vNaam = vNaam;
    }

    public String getaNaam() {
        return aNaam;
    }

    public void setaNaam(String aNaam) {
        this.aNaam = aNaam;
    }

    public Double getVoorschot() {
        return voorschot;
    }

    public void setVoorschot(double voorschot) {
        this.voorschot = voorschot;
    }
}
