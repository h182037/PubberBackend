package backend;

import model.Bar;
import model.Prices;

import java.util.ArrayList;

public class Calculator {
    private ArrayList<Bar> barlist;

    public Calculator(){
    }

    public ArrayList<Bar> calculate(boolean givenMoney, int amount, String drinktype, boolean club){
        ArrayList<Bar> returnlist;
        returnlist = cheapest(amount, drinktype, club);
        return returnlist;
    }

    public ArrayList<Bar> cheapest(int amount, String drinkType, boolean club){
        ArrayList<Bar> bars = clubOrNot(club);
        ArrayList<Bar> returnlist = new ArrayList<>();
        switch (drinkType){
            case "beer":
                int i = 0;
                Bar cheapestSoFar = bars.get(i);
                for(i = 1; i < bars.size(); i++){
                    int price = bars.get(i).getPrices().getBeer();
                    if(price < cheapestSoFar.getPrices().getBeer()){
                        cheapestSoFar = bars.get(i);
                    }
                    int offer = bars.get(i).getOffers().getBeer();
                    if(offer < cheapestSoFar.getOffers().getBeer()){
                        cheapestSoFar = bars.get(i);
                    }
                }
                returnlist.add(cheapestSoFar);
            case "wine":
                i = 0;
                cheapestSoFar = bars.get(i);
                for(i = 1; i < bars.size(); i++){
                    int price = bars.get(i).getPrices().getWine();
                    if(price < cheapestSoFar.getPrices().getWine()){
                        cheapestSoFar = bars.get(i);
                    }
                    int offer = bars.get(i).getOffers().getWine();
                    if(offer < cheapestSoFar.getOffers().getWine()){
                        cheapestSoFar = bars.get(i);
                    }
                }
                returnlist.add(cheapestSoFar);
            case "cider":
                i = 0;
                cheapestSoFar = bars.get(i);
                for(i = 1; i < bars.size(); i++){
                    int price = bars.get(i).getPrices().getCider();
                    if(price < cheapestSoFar.getPrices().getCider()){
                        cheapestSoFar = bars.get(i);
                    }
                    int offer = bars.get(i).getOffers().getCider();
                    if(offer < cheapestSoFar.getOffers().getCider()){
                        cheapestSoFar = bars.get(i);
                    }
                }
                returnlist.add(cheapestSoFar);
            case "shot":
                i = 0;
                cheapestSoFar = bars.get(i);
                for(i = 1; i < bars.size(); i++){
                    int price = bars.get(i).getPrices().getShot();
                    if(price < cheapestSoFar.getPrices().getShot()){
                        cheapestSoFar = bars.get(i);
                    }
                    int offer = bars.get(i).getOffers().getShot();
                    if(offer < cheapestSoFar.getOffers().getShot()){
                        cheapestSoFar = bars.get(i);
                    }
                }
                returnlist.add(cheapestSoFar);
        }
        return returnlist;
    }

    public ArrayList<Bar> clubOrNot(boolean club){
        ArrayList<Bar> bars = getBarlist();
        if(club){
            for(int i = 0; i < bars.size(); i ++){
                if(!bars.get(i).isClub()){
                    bars.remove(i);
                }
            }
        }else{
            for(int i = 0; i < bars.size(); i ++){
                if(bars.get(i).isClub()){
                    bars.remove(i);
                }
            }
        }
        return bars;

    }

    public ArrayList<Bar> getBarlist(){
        return this.barlist;
    }

    public void setBarlist(ArrayList<Bar> barlist) {
        this.barlist = barlist;
    }

    public void addDummies(){
        Prices dayprices = new Prices(45, 55, 59, 20, "Hverdagspriser");
        Prices BarOffer = new Prices(43, 72, 80, 30, "Lånekassen arrangement 2. Torsdag i måneden");
        Bar bar = new Bar("Kronbar", "Ved Høgskulen?", "kul og chill og sånn", false, "Bilete her", dayprices,BarOffer, 18);
        this.barlist.add(bar);

        Prices dayprices2 = new Prices(87, 96, 112, 68, "Vanlige priser");
        Prices Bar2Offer = new Prices(40, 70, 79, 19, "Hvis du kjenner bartenderen.");
        Bar bar2 = new Bar("Ferdinands", "Teatergaten, i dunno", "Hipsterkveld", true, "Bilete her også", dayprices2, Bar2Offer, 22);
        this.barlist.add(bar2);
    }
}
