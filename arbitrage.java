import java.util.ArrayList;






public class Arbitrage {
     
     

public static double calcprob(double odds){

    if(odds>0){

        Double temp=(100)/(100+odds);
return temp;        
        }else{
            double temp=(200)/(100+ ((-1)*odds) );
return temp;        
            }



}




     public static void main(String[] args) {
    

//index 1 from every arraylist will be the data from the same sportsbooking app

    ArrayList<Double> oddsofteam1= new ArrayList<>();
    ArrayList<Double> oddsofteam2= new ArrayList<>();
    ArrayList<Double> oddsofdraw= new ArrayList<>();

    ArrayList<Double> probofteam1= new ArrayList<>();
    ArrayList<Double> probofteam2= new ArrayList<>();
    ArrayList<Double> probofdraw= new ArrayList<>();

    

for(int i=0;i<oddsofteam1.size();i++){

    double temp=calcprob(oddsofteam1.get(i));
probofteam1.set(i,temp);

}



for(int i=0;i<oddsofteam2.size();i++){

    double temp=calcprob(oddsofteam2.get(i));
probofteam2.set(i,temp);

}        

for(int i=0;i<oddsofdraw.size();i++){

    double temp=calcprob(oddsofdraw.get(i));
probofdraw.set(i,temp);

}









    }
}
