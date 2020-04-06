package backend;

import model.Bar;
import model.Day;
import model.Prices;

import java.util.ArrayList;

public class Calculator {
    private int num_beers;
    private ArrayList<Bar> barlist;

    public Calculator(){
        this.num_beers = 10;
        addDummies();
    }

    public int calculate(int num, int budget){
        num_beers = num;
        return num_beers;
    }

    public int getNum_beers(){
        return num_beers;
    }

    public ArrayList<Bar> getBarlist(){
        return this.barlist;
    }

    public void addDummies(){
        Prices dayprices = new Prices(45, 55, 59, 20);
        Day everyday = new Day(0, dayprices, dayprices);
        ArrayList<Day> days = new ArrayList();
        for(int i = 0; i < 7; i++) {
            days.add(everyday);
        }
        Bar bar = new Bar("Kronbar", "Ved Høgskulen?", "kul og chill og sånn", false, "Bilete her", days, 18);
        this.barlist.add(bar);
        Prices dayprices2 = new Prices(87, 96, 112, 68);
        Day everyday2 = new Day(0, dayprices2, dayprices2);
        ArrayList<Day> days2 = new ArrayList();
        for(int i = 0; i < 7; i++) {
            days2.add(everyday2);
        }
        Bar bar2 = new Bar("Ferdinands", "Teatergaten, i dunno", "Hipsterkveld", false, "Bilete her også", days, 22);
        this.barlist.add(bar2);
    }
}
