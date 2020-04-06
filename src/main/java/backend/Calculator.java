package backend;

import model.Bar;
import model.Day;
import model.Prices;

import java.util.ArrayList;

public class Calculator {
    private ArrayList<Bar> barlist;

    public Calculator(){
        this.barlist = new ArrayList<>();
        addDummies();
    }

    public ArrayList<Bar> calculate(int num, int budget){
        ArrayList<Bar> returnlist = new ArrayList<Bar>();
        for(Bar b : barlist){
            if(b.getPrices().getBeer() < (budget/num)){
                returnlist.add(b);
            }
        }
        return returnlist;
    }

    public ArrayList<Bar> getBarlist(){
        return this.barlist;
    }

    public void addDummies(){
        Prices dayprices = new Prices(45, 55, 59, 20);
        Bar bar = new Bar("Kronbar", "Ved Høgskulen?", "kul og chill og sånn", false, "Bilete her", dayprices, 18);
        this.barlist.add(bar);

        Prices dayprices2 = new Prices(87, 96, 112, 68);
        Bar bar2 = new Bar("Ferdinands", "Teatergaten, i dunno", "Hipsterkveld", false, "Bilete her også", dayprices2, 22);
        this.barlist.add(bar2);
    }
}
