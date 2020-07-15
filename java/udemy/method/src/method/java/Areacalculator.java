package method.java;
public class Areacalculator {
    public static void main(String[] args) {
        String areaType="Rectangle";
        double radius=-5.0;
        double side1=7.0;
        double side2=9.0;
        if (areaType=="Circle"){
            double outArea=areaCalC(radius);
            if (outArea==-1){
                System.out.println("Value of radius is invalid");
            }
            else {
                System.out.println("Area of Circle: "+outArea);
            }
        }

        if (areaType=="Rectangle"){
            double outArea=areaCalC(side1,side2);
            if (outArea==-1){
                System.out.println("Value of sides are invalid");
            }
            else {
                System.out.println("Area of Rectangle: "+outArea);
            }
        }
    }
    public static double areaCalC(double rad) {
        if (rad<=0){
            return -1.0;
        }
        else {
            double val=Math.PI*rad*rad;
            return val;
        }
    }
    public static double areaCalC(double x,double y){
        if (x<=0||y<=0){
            return -1.0;
        }
        else {
            double val=x*y;
            return val;
        }
    }

}

//output-->
//Area of Rectangle: 63.0