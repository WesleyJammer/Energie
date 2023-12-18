package testenergie.energieopdracht1.Classes;

public class Verbruik {


    private Integer verGas;

    private Integer verStroom;

    public Verbruik(Integer verGas, Integer verStroom) {
        this.verGas = verGas;
        this.verStroom = verStroom;
    }

    public Integer getVerGas() {
        return verGas;
    }

    public void setVerGas(Integer verGas) {
        this.verGas = verGas;
    }

    public Integer getVerStroom() {
        return verStroom;
    }

    public void setVerStroom(Integer verStroom) {
        this.verStroom = verStroom;
    }
}


