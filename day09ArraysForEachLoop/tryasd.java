package day09ArraysForEachLoop;

import java.util.Arrays;
import java.util.Scanner;

public class tryasd {
    public static void main(String[] args) {
        int[][] giris2= new int[2][3];

        giris2[0][0]=10;
        giris2[0][1]=20;
        giris2[0][2]=30;
        giris2[1][0]=40;
        giris2[1][1]=50;
        giris2[1][2]=60;




        for (int i = 0; i <2; i++) {
            for (int j = 0; j <= 3; j++) {
                System.out.println("arrayleri gir === " + giris2[i][j]);
            }
        }



    }
}