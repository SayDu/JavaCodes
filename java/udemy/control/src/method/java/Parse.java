package method.java;
public class Parse {
    public static void main(String[] args) {
        String numAsStr="2020";
        System.out.println("Num as string "+numAsStr);

        int numAsInt=Integer.parseInt(numAsStr);
        System.out.println("Num as an int "+numAsInt);

        numAsStr+=1;
        numAsInt+=1;
        System.out.println("Num as string(adding 1) "+numAsStr);
        System.out.println("Num as an int(adding 1) "+numAsInt);
    }
}

//Notes-
//here 'Integer' is a wrapper class 'parseInt' is a static method to parsing from string

//output-
//Num as string 2020
//Num as an int 2020
//Num as string(adding 1) 20201
//Num as an int(adding 1) 2021
