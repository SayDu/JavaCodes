package method.java;
import java.util.Scanner;
public class Userin {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("Enter your name: ");
        String name=scanner.nextLine();
        System.out.println("Hello "+name+"!");
        System.out.println("What is your birth year?");
        int dobYear=scanner.nextInt();
        int ageYour=2020-dobYear;
        System.out.println("Your age is: "+ageYour);

        scanner.close();
    }
}
//notes-
//nextLine/nextInt these must be after the scanner to handle the enter key

//output-
//Enter your name:
//Sayan
//Hello Sayan!
//What is your birth year?
//1999
//Your age is: 21
