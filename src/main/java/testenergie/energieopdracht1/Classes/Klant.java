package testenergie.energieopdracht1.Classes;

public class Klant {


    private Integer klantnr;
    private String vNaam;
    private String aNaam;
    private Double voorschot;

    public Klant(Integer klantnr, String vNaam, String aNaam, Double voorschot) {
        this.klantnr = klantnr;
        this.vNaam = vNaam;
        this.aNaam = aNaam;
        this.voorschot = voorschot;
    }

    public Integer getKlantnr() {
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

    public void setVoorschot(Double voorschot) {
        this.voorschot = voorschot;
    }
}
