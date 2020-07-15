package calc;
public class Main {
    public static void main(String[] args) {
        Calc nums=new Calc();
        int num1=5;
        int num2=20;
        nums.setSum(num1,num2);
        System.out.println("Sum: "+nums.getSum());
    }
}

//Result-->
//Sum: 25