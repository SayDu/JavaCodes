package animal;
public class Dog extends Animal {
    private int eyes;
    private int legs;
    private int tail;
    private int teeth;
    private String coat;
    public Dog(String name, int brain, int body, int size, int weight,int eyes,int tail,int teeth,int legs,String coat) {
        super(name, 1, 1, 4, 15);
        this.eyes=eyes;
        this.tail=tail;
        this.legs=legs;
        this.teeth=teeth;
        this.coat=coat;
    }
    private void chew(){
        System.out.println("Dog.chw() called");
    }

    @Override
    public void eat() {
        System.out.println("Dog.eat() called");
        chew();
        super.eat();
    }
}

//notes:
//super--it is a keyword to call the constructor i.e for the class we are extending from
//extends--extending or inheriting Animal class