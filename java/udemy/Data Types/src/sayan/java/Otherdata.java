package sayan.java;
public class Otherdata {
    public static void main(String[] args) {
        byte minByte = Byte.MIN_VALUE;
        byte maxByte = Byte.MAX_VALUE;
        System.out.println("Min Byte:" + minByte);
        System.out.println("Max Byte:" + maxByte);
        byte finalByte=(byte)(minByte/2);
        System.out.println("Final value:"+finalByte);

        short minShort = Short.MIN_VALUE;
        short maxShort = Short.MAX_VALUE;
        System.out.println("Min short:" + minShort);
        System.out.println("Max short:" + maxShort);
        short finalShort=(short)(minShort/2);
        System.out.println("Final short:"+finalShort);
        
        long myLong=1000l;
        long minLong = Long.MIN_VALUE;
        long maxLong = Long.MAX_VALUE;
        System.out.println("Min long:" + minLong);
        System.out.println("Max long:" + maxLong);
        long finalLong=(long)(minLong/2l);
        System.out.println("Final Long"+finalLong);
    }
}

//NOTES--->

//casting--> converting a number from one type to another

//Output-->
//Min Byte:-128
//Max Byte:127
//Final value:-64
//Min short:-32768
//Max short:32767
//Final short:-16384
//Min long:-9223372036854775808
//Max long:9223372036854775807
//Final Long-4611686018427387904
