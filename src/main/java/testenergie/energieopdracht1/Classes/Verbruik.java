package testenergie.energieopdracht1.Classes;

public class Verbruik {


    private String geld;
    private String geld2;
    private String geld3;

    public Verbruik(String geld, String geld2, String geld3) {
        this.geld = geld;
        this.geld2 = geld2;
        this.geld3 = geld3;
    }

    public String getGeld() {
        return geld;
    }

    public void setGeld(String geld) {
        this.geld = geld;
    }

    public String getGeld2() {
        return geld2;
    }

    public void setGeld2(String geld2) {
        this.geld2 = geld2;
    }

    public String getGeld3() {
        return geld3;
    }

    public void setGeld3(String geld3) {
        this.geld3 = geld3;
    }
}
