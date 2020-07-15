package sayan.java;

public class Flodoub {
    public static void main(String[] args) {
        float myMinFloat=Float.MIN_VALUE;
        float myMaxFloat=Float.MAX_VALUE;
        System.out.println("Min Float value:"+myMinFloat);
        System.out.println("Max Float value:"+myMaxFloat);
        double myMinDouble=Double.MIN_VALUE;
        double myMaxDouble=Double.MAX_VALUE;
        System.out.println("Min Double value:"+myMinDouble);
        System.out.println("Max Double value:"+myMaxDouble);

        int myVal=5;
        float myFlVal=(float) 5.25;//typecast from double to float or type '5.25f' instead of '(float)5.25'.
        double myDouVal=5.34444d;//it also can be typecaseted in same manner
        System.out.println("Integer:"+myVal);
        System.out.println("Float:"+myFlVal);
        System.out.println("Double:"+myDouVal);

    }

}

//NOTES--->

//precision--> it refers to the format and space occupied by the type.single preci takes 32 bits(so has width 32) and a double preci takes 64 bit

//float,int are of single precision & double,long are of double precision.


//Output-->
//Min Float value:1.4E-45
//Max Float value:3.4028235E38
//Min Double value:4.9E-324
//Max Double value:1.7976931348623157E308
//Integer:5
//Float:5.25
//Double:5.34444
