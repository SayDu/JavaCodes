package clac;
import java.util.Scanner;
public class Calc {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        Sub sub=new Sub();
        sub.printArr();
        sc.close();
    }
}
//output-->
//Enter no of inputs:
//5
//Enter your input: 1. for sum of array 2. for multiplication of array
//1
//Give input:
//4 5 7 0 1
//17