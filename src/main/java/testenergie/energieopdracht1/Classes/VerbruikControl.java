package testenergie.energieopdracht1.Classes;

import java.util.ArrayList;

public class VerbruikControl {

    private ArrayList<Object> verbruik;
    private double tarGas;
    private double tarStroom;



    public VerbruikControl() {
        this.verbruik = new ArrayList<Object>();
    }

    public void addGasToList(double gasPrijs){


        Gas g = new Gas(gasPrijs);

        verbruik.add(g);
    }


    public  void addStroomToList(double stroomPrijs){

        Stroom s = new Stroom(stroomPrijs);

        verbruik.add(s);
    }

    public void addVerbruikToList(Integer verGas, Integer verStroom){

        Verbruik v = new Verbruik(verGas, verStroom);

        verbruik.add(v);


    }

    public void setTarief(double tarGas, double tarStroom){

        this.tarGas = tarGas;
        this.tarStroom = tarStroom;



    }

    public double getTarGas() {
        return tarGas;
    }

    public double getTarStroom() {
        return tarStroom;
    }
}
