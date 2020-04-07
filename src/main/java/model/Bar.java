package model;


public class Bar {
    private String Name;
    private String Address;
    private String Description;
    private boolean Club;
    private String IMG;
    private Prices prices;
    private int CC;
    private Prices offers;
    private int Age;

    public Bar() {

    }

    public Bar(String name, String address, String description, boolean club, String IMG, Prices p, Prices off, int age) {
        Name = name;
        Address = address;
        Description = description;
        Club = club;
        this.IMG = IMG;
        this.prices = p;
        Age = age;
        this.offers = off;
    }

    public int getCC() {
        return CC;
    }

    public void setCC(int CC) {
        this.CC = CC;
    }

    public Prices getOffers() {
        return offers;
    }

    public void setOffers(Prices offers) {
        this.offers = offers;
    }

    public Prices getPrices() {
        return prices;
    }

    public void setPrices(Prices prices) {
        this.prices = prices;
    }


    public String getName() {
        return Name;
    }

    public void setName(String name) {
        Name = name;
    }

    public String getAddress() {
        return Address;
    }

    public void setAddress(String address) {
        Address = address;
    }

    public String getDescription() {
        return Description;
    }

    public void setDescription(String description) {
        Description = description;
    }

    public boolean isClub() {
        return Club;
    }

    public void setClub(boolean club) {
        Club = club;
    }

    public String getIMG() {
        return IMG;
    }

    public void setIMG(String IMG) {
        this.IMG = IMG;
    }

    public int getAge() {
        return Age;
    }

    public void setAge(int age) {
        Age = age;
    }
}
