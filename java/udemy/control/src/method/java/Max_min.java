package method.java;
import java.util.Random;
import java.util.Scanner;
public class Max_min {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        int max=0;
        int min=0;
        boolean first=true;
        while (true){
            System.out.println("Give the number: ");
            boolean isAnint=scanner.hasNextInt();
            if (isAnint){
                int number=scanner.nextInt();
                if (first){
                    first=false;
                    min=number;
                    max=number;
                }
                if (number>max){
                    max=number;
                }
                if (number<min){
                    min=number;
                }
            }
            else {
                break;
            }
            scanner.nextLine();
        }
        System.out.println("Max no: "+max);
        System.out.println("Min no: "+min);
        scanner.close();
    }
}

//note-
//hasNext()--> it is a method of java scanner class which returns true if this scanner has another token in its input
//boolean first is used as a flag..here after user gives his first input ,the value of min and max set to the input and flag become false so max,min ont be zero as initialized
//to do without using flag set max=-2147483648; min=2147483648 or min=Integer.MAX_VALUE; max=Integer.MIN_VALUE;

//output-->
//Give the number:
//5
//Give the number:
//1
//Give the number:
//200
//Give the number:
//65493
//Give the number:
//-8546
//Give the number:
//l
//Max no: 65493
//Min no: -8546