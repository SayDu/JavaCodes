package codechef;
import java.util.Scanner;
public class Codechef {
    public static void main(String[] args) {
        int[] tCaseArr=new int[100];
        String[] returnData=new String[100];
        int[] amtArr=new int[1000];
        Scanner sc=new Scanner(System.in);
        Ice iceSeller=new Ice();
//        System.out.println("Enter the num of test cases: ");
        int testCase=sc.nextInt();
        for (int i=0;i<testCase;i++){
            tCaseArr[i]=i;
//            System.out.println("Enter the no of person: ");
            int person=sc.nextInt();
            iceSeller.persons=person;
            for (int j=0;j<person;j++){
//                System.out.println("Enter amount each one has:");
                int amountEachhas=sc.nextInt();
                amtArr[j]=amountEachhas;
            }
            iceSeller.amountArr=amtArr;
//            iceSeller.printArr();
            boolean retVal=iceSeller.possible();
            if (retVal==true){
                returnData[i]="YES";
            }
            else {
                returnData[i]="NO";
            }
        }
//        iceSeller.caseArr=tCaseArr;
        for (int va=0;va<testCase;va++){
            System.out.println(returnData[va]);
        }

    }
}
