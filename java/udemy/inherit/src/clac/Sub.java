//Sub class-1
package clac;
import java.util.Scanner;
public class Sub extends Super {
    int[] myArr=new int[100];
    int outPut;
    Scanner scanner=new Scanner(System.in);
    public void printArr(){
        System.out.println("Enter no of inputs: ");
        int noIn=scanner.nextInt();
        System.out.println("Enter your input: 1. for sum of array 2. for multiplication of array");
        int wantTo=scanner.nextInt();
        outPut=arrIn(noIn,wantTo);
        System.out.println(outPut);
    }
}
//we can make another sub class-2 by extending sub class-1 (as done here) to that sub class-2 and then sub-1 will act as master of sub-2
// that's how multiple sub class can be done