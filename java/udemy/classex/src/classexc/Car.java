package classexc;
public class Car {
    private int doors;
    private int wheels;
    private String model;
    private String engine;
    private String color;

    public void setModel(String model){
        String valModel=model.toLowerCase();
        if (valModel.equals("carrera gt")||valModel.equals("tata")) {
            this.model = model;
        }
        else {
            this.model="Unknown";
        }
    }
    public String getModel(){
        return this.model;
    }
}

//notes-->
//Keyword 'this' in Java is a reference variable that refers to the current object
//.equals() methods check the type of the data