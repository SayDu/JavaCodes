package constru;
public class Bank {
    public int amountDepo;
    public int amountWithd;
    public int amountInAcc=0;
    public String userName;
    public String branch;
    public void setAmountDepo(int amt){
        this.amountInAcc=amountInAcc+amt;
        this.amountDepo=amt;
        System.out.println("Amount Deposited: "+this.amountDepo+" by "+userName+" from "+branch+" branch");
        System.out.println("New account balance: "+amountInAcc);
    }

    public void setAmountWithd(int amtW){
        this.amountWithd=amtW;
        if (amountInAcc==0||amountWithd>amountInAcc){
            System.out.println("Sorry!there is no money in account or insufficient balance");
        }
        else {
            System.out.println("Money Withdrawn: "+amountWithd+" by "+userName+" from "+branch+" branch");
            int leftBal=amountInAcc-amountWithd;
            System.out.println("Balance Remaining: "+leftBal);
        }
    }
}
