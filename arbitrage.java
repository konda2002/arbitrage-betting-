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
    

//index 1 of all arrays gives the odds from booky1, index 2 from every array gives odds from booky 2 etc...

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
int booky1;
int booky2;
int booky3;

for(int i=0;i<probofteam1.size();i++){
    for(int j=0;j<probofteam2.size();j++){
        for(int k=0;k<probofdraw.size();k++){

            if(probofteam1.get(i)+probofteam2.get(j)+probofdraw.get(k)<100.0){
                double profit_opportunity=100-(probofteam1.get(i)+probofteam2.get(j)+probofdraw.get(k));
booky1=i;
booky2=j;
booky3=k;

System.out.println("arbitrage opportunity for " + profit_opportunity +"% found using:");
System.out.println("booky for team1= " + booky1);
System.out.println("booky for team2= " + booky2);
System.out.println("booky for draw= " + booky3);


            }

        }
    }
}









    }
}
