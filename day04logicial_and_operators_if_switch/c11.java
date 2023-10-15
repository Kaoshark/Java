package day04logicial_and_operators_if_switch;

import java.util.Scanner;

public class c11 {
    public static void main(String[] args) {
        Scanner input= new Scanner(System.in);
        int sayi1,sayi2,secim;
        System.out.println("First number");
        sayi1= input.nextInt();
        System.out.println("Second number");
        sayi2= input.nextInt();
        System.out.println("Please write the process you want");
        System.out.println("1-Division \n 2-Multiple \n 3-Addition \n 4-Subtraction ");
        System.out.println("Seciminiz:");
        secim=input.nextInt();

        if (secim==1){
            System.out.println("Toplama : " + (sayi1 + sayi2));
    } else if (secim==2){
            System.out.println("Cikarma:" + ( sayi1 - sayi2));
        } else if (secim==3){
            System.out.println("Carpma:" + (sayi1*sayi2));
        } else if (secim==4){
            System.out.println("Bolme :" + (sayi1/sayi2));
        } else {
            System.out.println( "Gecersiz islem girdiniz");
        }
}}
