package day07Loops;

import java.util.Scanner;

public class C03ForLoops {
    public static void main(String[] args) {
        /*
        Type code to print the following image on the console

        x x x x x
        x x x x x
        x x x x x

         */

        int row = 2;
        int column=6;

        for (int i=1; i<=row;      i++){

            String m = "";


            for (int k=1; k<=column ; k++){

                m= m+"x";
            }
            System.out.println(m);
        }
    }
}
