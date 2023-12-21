package testenergie.energieopdracht1.Classes;

public class Klant {


    private Integer klantnr;
    private String vNaam;
    private String aNaam;
    private double voorschot;
    private double voorschotGas;

    public Klant(Integer klantnr, String vNaam, String aNaam, double voorschot, double voorschotGas) {
        this.klantnr = this.klantnr;
        this.vNaam = this.vNaam;
        this.aNaam = this.aNaam;
        this.voorschot = this.voorschot;
        this.voorschotGas = this.voorschotGas;
    }


    public Integer getKlantnr() {
        return klantnr;
    }

    public double getVoorschotGas() {
        return voorschotGas;
    }

    public void setVoorschotGas(double voorschotGas) {
        this.voorschotGas = voorschotGas;
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
