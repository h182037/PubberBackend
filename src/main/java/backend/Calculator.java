package backend;

import model.Bar;
import model.Prices;

import java.util.ArrayList;

public class Calculator {
    private ArrayList<Bar> barlist;

    public Calculator(){
        this.barlist = new ArrayList<>();
        addDummies();
    }

    public ArrayList<Bar> calculate(boolean givenMoney, int amount, String drinktype, boolean club){
        ArrayList<Bar> returnlist = new ArrayList<>();
        if(givenMoney){
            switch (drinktype){
                case "beer":
                    returnlist.add(getBarlist().get(0));
                case "wine":
                    returnlist.add(getBarlist().get(0));
                case "cider":
                    returnlist.add(getBarlist().get(0));
                case "shot":
                    returnlist.add(getBarlist().get(0));
            }
        }else {
            switch (drinktype){
                case "beer":
                    returnlist.add(getBarlist().get(0));
                case "wine":
                    returnlist.add(getBarlist().get(0));
                case "cider":
                    returnlist.add(getBarlist().get(0));
                case "shot":
                    returnlist.add(getBarlist().get(0));
            }
        }
        return returnlist;
    }

    public ArrayList<Bar> getBarlist(){
        return this.barlist;
    }

    public void addDummies(){
        Prices dayprices = new Prices(45, 55, 59, 20);
        Bar bar = new Bar("Kronbar", "Ved Høgskulen?", "kul og chill og sånn", false, "Bilete her", dayprices,(new Prices()), 18);
        this.barlist.add(bar);

        Prices dayprices2 = new Prices(87, 96, 112, 68);
        Prices Bar2Offer = new Prices(43, 72, 80, 30);
        Bar bar2 = new Bar("Ferdinands", "Teatergaten, i dunno", "Hipsterkveld", false, "Bilete her også", dayprices2, Bar2Offer, 22);
        this.barlist.add(bar2);
    }
}
