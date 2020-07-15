package calc;
public class Calc {
    public int num1;
    public int num2;
    public int numRes;
    public void setSum(int n1,int n2){
        this.num1=n1;
        this.num2=n2;
        this.numRes=num1+num2;
    }
    public int getSum(){
        return this.numRes;
    }

}
