//Super class
package clac;
import java.util.Scanner;
public class Super {
    Scanner scanner=new Scanner(System.in);
    int[] digArr=new int[100];
    public int arrIn(int val,int func){
        int noInp=val;
        int jobTodo=func;
        System.out.println("Give input: ");
        for (int i=0;i<noInp;i++){
            int userVal=scanner.nextInt();
            digArr[i]=userVal;
        }
        if (jobTodo==1){
            int initial=0;
            int temp;
            for (int i=0;i<noInp;i++){
                temp=digArr[i];
                initial=initial+temp;
            }
            return initial;
        }
        else {
            int initial=1;
            int temp;
            for (int i=0;i<noInp;i++){
                temp=digArr[i];
                initial=initial*temp;
            }
            return initial;
        }
    }
}
