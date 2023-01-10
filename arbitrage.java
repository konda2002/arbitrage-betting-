import java.util.ArrayList;
import java.util.*;






public class Arbitrage {

public static double calcprob(double odds){

    if(odds>0){

        Double temp=((100)/(100+odds))*100;
return temp;        
        }else{
            double temp=((200)/(100+ ((-1)*odds) ))*100;
return temp;        
            }



}




     public static void main(String[] args) {
    

//index 1 of all arrays gives the odds from booky1, index 2 from every array gives odds from booky 2 etc...
//initialise draw arraylist only if there are odds available for the game to draw 
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

// the values of these ints give the respective booky odds we found the arbitrage opportunity with, suppose 1 2 3, we found an opportunity using odds for team1 with booky 1, team2 with booky 2, draw with booky 3 

double minprob1=Collections.min(probofteam1);
double minprob2=Collections.min(probofteam2);
double minprobdraw=Collections.min(probofdraw);


int bookyindexof1;
int bookyindexof2;
int bookyindexofdraw;

double sum=minprob1+minprob2+minprobdraw;

if(sum<100){
bookyindexof1=probofteam1.indexOf(minprob1);
bookyindexof2=probofteam1.indexOf(minprob2);
bookyindexofdraw=probofteam1.indexOf(minprobdraw);
double profit_percentage=100-sum;
System.out.println("arbitrage opportunity for " + profit_percentage +"% found using:");
System.out.println("booky for team1= " + bookyindexof1);
System.out.println("booky for team2= " + bookyindexof2);
System.out.println("booky for draw= " + bookyindexofdraw);
System.out.println("time to make some money:)");


}











    }
}
