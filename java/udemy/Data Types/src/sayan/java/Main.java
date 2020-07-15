package sayan.java;

public class Main {

    public static void main(String[] args) {
        int minInt=Integer.MIN_VALUE;
        int maxInt=Integer.MAX_VALUE;
        int myVal=maxInt+1;
        System.out.println("Min value of integer:"+minInt);
        System.out.println("Max value of integer:"+maxInt);
        System.out.println("My value:"+myVal);
        System.out.println("My second value:"+(minInt-1));

    }
}

//A package is a way to organize all the java projects. Here java is a subfolder of sayan.

//here 'Integer' is a wrapper class. every primitive data types has wrapper class. application of it is shown above

//here myVal had an overflow & my sec value is in underflow. We can not do overflow or underflow manually

//Output-->
//Min value of integer:-2147483648
//Max value of integer:2147483647
//My value:-2147483648
//My second value:2147483647
