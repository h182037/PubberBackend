public class Calculator {
    private int num_beers;

    public Calculator(){
        this.num_beers = 10;
    }

    public int calculate(int num){
        num_beers = num;
        return num_beers;
    }

    public int getNum_beers(){
        return num_beers;
    }
}
