package backend;

public class CallObject {
    private  boolean givenMoney;
    private int amount;
    private String drinkType;
    private boolean club;

    public CallObject(){

    }

    public boolean isGivenMoney() {
        return givenMoney;
    }

    public void setGivenMoney(boolean givenMoney) {
        this.givenMoney = givenMoney;
    }

    public int getAmount() {
        return amount;
    }

    public void setAmount(int amount) {
        this.amount = amount;
    }

    public String getDrinkType() {
        return drinkType;
    }

    public void setDrinkType(String drinkType) {
        this.drinkType = drinkType;
    }

    public boolean isClub() {
        return club;
    }

    public void setClub(boolean club) {
        this.club = club;
    }
}
