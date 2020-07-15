package method.java;

public class Main {
    public static void main(String[] args) {
        boolean Over=false;
        float Score=2000;
        int level=5;
        calculate(Over,level,Score);

        boolean matchOver=true;
        float lastScore=2500;
        int plevel=5;
        float bScore=calc(matchOver,plevel,lastScore);
        System.out.println("score: "+bScore);
    }
    public static void calculate(boolean gameOver, int levComp, float finalScore) {  //calculate() is a method...void means return nothing...
        if (finalScore < 1000 || levComp < 5) {
            System.out.println("Better luck next time");
        } else if (finalScore == 1000 && gameOver == false && levComp == 5) {
            System.out.println("Well done!");
        } else {
            float bonus = (float) ((finalScore - 1000) / 20);
            System.out.println("Passed! Bonus will be added:" + bonus);
        }
    }
// returning float type value--> to return boolean false=-1,true=1
    public static float calc(boolean gameOver, int levComp, float finalScore) {
       float bonusScore=0;
//        if (finalScore < 1000 || levComp < 5) {
//            System.out.println("Better luck next time");
//        }
//        else if (finalScore == 1000 && gameOver == false && levComp == 5) {
//            System.out.println("Well done!");
//        }
//        else {
//            bonusScore = (finalScore - 1000) / 20;
////            System.out.println("Passed! Bonus will be added:" + bonus);
//        }
        if (gameOver){
            System.out.println("you lost");
            bonusScore=0;
        }
        else if (finalScore>1000 && levComp==5){
            System.out.println("Congrats!");
            bonusScore=((finalScore-1000)/20)+finalScore;
        }
        else{
            bonusScore=finalScore;
        }
        return bonusScore;
    }
}

//NOTES-->

//We cant put one method inside of another method.

//OUTPUT-->
//Passed! Bonus will be added:50.0
//you lost
//score: 0.0