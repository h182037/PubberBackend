package model;

public class Prices {
    private int Beer;
    private int Cider;
    private int Wine;
    private int Shot;

    public Prices() {

    }

    public Prices(int beer, int cider, int wine, int shot) {
        Beer = beer;
        Cider = cider;
        Wine = wine;
        Shot = shot;
    }

    public int getBeer() {
        return Beer;
    }

    public void setBeer(int beer) {
        Beer = beer;
    }

    public int getCider() {
        return Cider;
    }

    public void setCider(int cider) {
        Cider = cider;
    }

    public int getWine() {
        return Wine;
    }

    public void setWine(int wine) {
        Wine = wine;
    }

    public int getShot() {
        return Shot;
    }

    public void setShot(int shot) {
        Shot = shot;
    }
}
