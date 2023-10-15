package DAY15OOP;


public class C03Dog extends C02Mammal{

    public double price;

    public C03Dog(){

        System.out.println("No parameter");
    }
    public C03Dog(double price){
        super("puppy",2);
        System.out.println("Price parameter");
    }
}