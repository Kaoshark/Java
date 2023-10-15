package day04logicial_and_operators_if_switch;

import java.util.Scanner;

public class C06IfStatement04 {
    public static void main(String[] args) {
        Scanner input= new Scanner(System.in);
        System.out.println("Enter mark...");
        int mark = input.nextInt();

        if (mark<50){
            System.out.println("D");

        }else if(mark<60){
            System.out.println("C");
        }else if(mark<80){
            System.out.println("B");
        }else if(mark<101){
            System.out.println("A");
        }else {
            System.out.println("More than 100 is not valid mark");
        }

    }
}
