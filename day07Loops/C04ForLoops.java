package day07Loops;

public class C04ForLoops {
    public static void main(String[] args) {
        /*
        Print the following structure on the console
        Week1:
        Day:1
        Day2:
        Day3:

        Week2:
        Day1:
        Day2:
        Day3:
         */

        int week =4;
        int day =7;

        for (int i=1;  i<=week; i++){

            System.out.println("Week" + i);

         for ( int k=1; k<=day; k++){
             System.out.println("Day" +k);

         }
        }
    }
}
