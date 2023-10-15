package day03_ScannerClass;

import java.util.Scanner;

public class deneme {
    public static void main(String[] args) {
        Scanner input= new Scanner(System.in);

        System.out.println("Adamin ismi ne :");
        String ismi = input.nextLine();

        System.out.println("What is your age :");
        byte age = input.nextByte();

        System.out.println("What is your heigth");
        float heigth= input.nextFloat();

        System.out.println("Can you tell me about, are you married:");
        boolean evlimi= input.nextBoolean();

        System.out.println("Adamin ismi :"+ ismi);
        System.out.println("Adamin yasi kac :" + age);
        System.out.println("Adamin boyu kac :"+ heigth);
        System.out.println("Adam evli mi :" + evlimi);



    }
}
