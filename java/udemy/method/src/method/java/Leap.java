package method.java;
public class Leap {
    public static void main(String[] args) {
        int isYear = 2028;
        boolean reData = isLeapYear(isYear);
        if (reData)
            System.out.println("Leap Year: "+isYear);
        else System.out.println("Is not a leap year: "+isYear);
    }
    public static boolean isLeapYear(int year) {
        if (year < 400) {
            if (year % 4 == 0) {
                return true;
            }
            else {
                return false;
            }
        }
        else {
            if (year % 100 == 0) {
                if (year % 400 == 0) {
                    return true;
                }
                else {
                    return false;
                }
            }
            else {
                if (year%4==0){
                    return true;
                }
                else {
                    return false;
                }
            }
        }
    }
}

//output:
//Leap Year: 2028