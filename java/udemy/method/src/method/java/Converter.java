package method.java;
public class Converter {
    public static void main(String[] args) {
        int valIn=5120;
        String outValBig=isConverted(valIn);
        System.out.println(outValBig);
    }
    public static String isConverted(int kbVal) {
        if (kbVal<0){
            return "Invalid Input";
        }
        else {
            if (kbVal<1024){
                return (String.valueOf(kbVal)+" kb") ;
            }
            else {
                int mbBig=kbVal/1024;
                int mbSmall=kbVal%1024;
                return (String.valueOf(mbBig)+" mb "+String.valueOf(mbSmall)+" kb ");
            }
        }
    }
}

//Notes: Here String.valueof(int) is use to direct typecast from int to string
//output: 5 mb 0 kb