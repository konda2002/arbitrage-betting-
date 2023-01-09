import java.util.ArrayList;

public class Arbitrage {
     public static void main(String[] args) {
    

//index 1 from every arraylist will be the data froom the same sportsbooking app

    ArrayList<Double> oddsofteam1= new ArrayList<>();
    ArrayList<Double> oddsofteam2= new ArrayList<>();
    ArrayList<Double> probofteam1= new ArrayList<>();
    ArrayList<Double> probofteam2= new ArrayList<>();


    for(int i=0;i<oddsofteam1.size();i++){

        
if(oddsofteam1.get(i)>0){

Double temp=(100)/(100+oddsofteam1);
    probofteam1.add(i, temp);

}else if(oddsofteam1.get(i)<0){
    double temp=(200)/(100+((-1)*oddsfrom1));
    probofteam1.add(i, temp);

    }
    
    }



    for(int i=0;i<oddsofteam2.size();i++){

        
        if(oddsofteam2.get(i)>0){
        
        Double temp=(100)/(100+oddsofteam2);
            probofteam2.add(i, temp);
        
        }else if(oddsofteam2.get(i)<0){
            double temp=(200)/(100+((-1)*oddsfrom1));
            probofteam2.add(i, temp);
        
            }
            
            }
        
        









    }
}
