package constru;
import java.util.Scanner;
public class Main {
    public Main() {
    }

    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        Bank myBank=new Bank();
        System.out.println("Enter your name: ");
        String name=scanner.nextLine();
        myBank.userName=name;
        System.out.println("Enter branch name: ");
        String branch=scanner.nextLine();
        myBank.branch=branch;
        boolean val=true;
        while (val==true){
            System.out.println("For Deposite press 1 & For Withdraw press 2 & For Exit press 3");
            int selection=scanner.nextInt();
            if (selection==1){
                System.out.println("Enter amount to deposite: ");
                int amtD=scanner.nextInt();
                myBank.setAmountDepo(amtD);
            }
            if (selection==2){
                System.out.println("Enter amount to withdraw: ");
                int amtW=scanner.nextInt();
                myBank.setAmountWithd(amtW);
            }
            if (selection==3){
                val=false;
            }
        }
        scanner.close();
    }
}

//output-->
//Enter your name:
//Sayan
//Enter branch name:
//Salkia
//For Deposite press 1 & For Withdraw press 2 & For Exit press 3
//1
//Enter amount to deposite:
//2000
//Amount Deposited: 2000 by Sayan from Salkia branch
//New account balance: 2000
//For Deposite press 1 & For Withdraw press 2 & For Exit press 3
//2
//Enter amount to withdraw:
//1000
//Money Withdrawn: 1000 by Sayan from Salkia branch
//Balance Remaining: 1000
//For Deposite press 1 & For Withdraw press 2 & For Exit press 3
//3