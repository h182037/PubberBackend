package model;

public class Day {
    private int CC;
    private Prices Night;
    private Prices Morning;

    public Day() {

    }

    public Day(int CC, Prices night, Prices morning) {
        this.CC = CC;
        Night = night;
        Morning = morning;
    }

    public int getCC() {
        return CC;
    }

    public void setCC(int CC) {
        this.CC = CC;
    }

    public Prices getNight() {
        return Night;
    }

    public void setNight(Prices night) {
        Night = night;
    }

    public Prices getMorning() {
        return Morning;
    }

    public void setMorning(Prices morning) {
        Morning = morning;
    }
}
