package model;

public class Bar {
    private String Name;
    private String Address;
    private String Description;
    private boolean Club;
    private String IMG;
    private Day[] Days;
    private int Age;

    public Bar() {
        Days = new Day[6];
    }

    public Bar(String name, String address, String description, boolean club, String IMG, Day[] days, int age) {
        Name = name;
        Address = address;
        Description = description;
        Club = club;
        this.IMG = IMG;
        Days = days;
        Age = age;
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

    public Day[] getDays() {
        return Days;
    }

    public void setDays(Day[] days) {
        Days = days;
    }

    public int getAge() {
        return Age;
    }

    public void setAge(int age) {
        Age = age;
    }
}
