package method.java;
public class Floop {
    public static void main(String[] args) {
        double initial=100000;
        double rateYear=5.5;
        int timeTaken=10;
        double payableAm=calcInterest(initial,rateYear,timeTaken);
        System.out.println("Total amount to pay: "+payableAm);
    }
    public static double calcInterest(double start,double r,int t){
        for (int i=1;i<=t;i++){
            start=start+(start*(r/100));
        }
        return start;
    }
}
