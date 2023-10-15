package DAY15OOP;

public class C02Mammal extends C01Animal{

    public String type;
    public int height;

    public C02Mammal(){
        super("cute");
        System.out.println("No parameter");
    }
    public C02Mammal(String type, int height){
        this();
        System.out.println("Type and Height parameters");
    }

}