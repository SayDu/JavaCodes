package method.java;
public class Overload {
    public static void main(String[] args) {
        //calling 1st overloaded method
        int newScore=calcScore("Jhon",50);
        System.out.println("New score is: "+newScore);
        //calling 2nd overloaded method
        int overScore=calcScore(700);
        System.out.println(overScore);
        //calling 3rd overloaded method
        int noScore=calcScore();
        System.out.println(noScore);
        //calling 4th method
        calcScore("Jhon");
    }
    public static int calcScore(String playerName,int score){
        System.out.println("Player "+playerName+" scored "+score);
        return score*10;
    }
    public static int calcScore(int score){
        System.out.println("Player scored "+score);
        return score*2;
    }
    public static int calcScore(){
        System.out.println("no player");
        return 0;
    }
    public static void calcScore(String strName){
        System.out.println("hi "+strName);
    }
}

//notes:
//overloading-using same method with different no. or types or none of the arguments in same code

//output-
//Player Jhon scored 50
//        New score is: 500
//        Player scored 700
//        1400
//        no player
//        0
//        hi Jhon
