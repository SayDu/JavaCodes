package sayan.java;

public class Test1 {
    public static void main(String[] args) {
        byte myByte=120;
        short myShort=380;
        int myInt=1000;
        long myLong=(long)(50000L+(10L*(myByte+myInt+myShort)));
        System.out.println("Final value stored as long data-type is:"+myLong);
    }
}

//Output
//Final value stored as long data-type is:65000