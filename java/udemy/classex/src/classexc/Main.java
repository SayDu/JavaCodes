package classexc;

public class Main {
    public static void main(String[] args) {
        Car porsche=new Car();
        Car tata=new Car();
        porsche.setModel("Carrera GT");
        System.out.println("Model is "+porsche.getModel());
    }
}

//notes-->
//class is the blueprint of creating new object
//public keyword is an access modifier(determines we want to allow other to access this class) who allows everyone to access
//The Java new keyword is used to create an instance of the class In other words, it instantiates a class by allocating memory for a new object and returning a reference to that memory. We can also use the new keyword to create the array object.

//output-->
//Model is Carrera GT