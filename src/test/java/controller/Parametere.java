package controller;

public class Parametere {
    public int num;
    public int budget;

    public int getNum() {
        return num;
    }

    public void setNum(int num) {
        this.num = num;
    }

    public int getBudget() {
        return budget;
    }

    public void setBudget(int budget) {
        this.budget = budget;
    }

    public Parametere(int num, int budget) {
        this.num = num;
        this.budget = budget;
    }
}
