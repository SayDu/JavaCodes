package codechef;
public class Ice {
    public int persons;
    public int[] caseArr=new int[100];
    public int[] amountArr=new int[1000];
    public boolean possible(){
        int initial=0;
        if (amountArr[0]>5||amountArr[0]<5){
            return false;
        }
        else {
            for (int z=0;z<persons;z++){
                if (amountArr[z]-initial==5){
                    initial=initial+5;
                    continue;
                }
                else {
                    return false;
                }
            }
        }
        return true;
    }

//    public void printArr(){
//        for (int x=0;x<persons;x++){
//            int val=amountArr[x];
//            System.out.println(val);
//        }
//    }
}

