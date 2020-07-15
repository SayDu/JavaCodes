package ops.java;
public class Logops {
    public static void main(String[] args) {
    int topScore1=110;
    int topScore2=80;
//    Logical and operator in use---> &&
    if (topScore1>topScore2 && topScore1==110){
        System.out.println("Best score is 110");
    }
//    Logical or in use---> ||
        if (topScore1>topScore2 || topScore1>100){
            System.out.println("Best score is "+topScore1+" and greater than hundred");
        }
//        NOT in use-->
        boolean isCar=false;
        if (!isCar)
            System.out.println("it's a not operator");
//        Ternary operator-->
        isCar=true;
        boolean wasCar= isCar==true?true:false;
        if (wasCar)
            System.out.println("wasCar is true");
    }
}

//Notes-->

//assignment operator---> ==   NOT operator---> !

//ternary operator--> if-then-else

//OUTPUT-->
//Best score is 110
//Best score is 110 and greater than hundred
//it's a not operator
//wasCar is true