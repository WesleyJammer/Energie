package testenergie.energieopdracht1.Classes;

public class Gas {


// prive variabele aanmaken voor gasprijs
    private double gasPrijs;


    public void setGasPrijs(double gasPrijs) {
        this.gasPrijs = gasPrijs;
    }
// constructor aanmaken voor gas
    public Gas(double gasPrijs) {
        this.gasPrijs = gasPrijs;
    }


    public double getGasPrijs() {
        return gasPrijs;
    }
}
