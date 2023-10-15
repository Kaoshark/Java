package day04logicial_and_operators_if_switch;

import java.util.Scanner;

public class C09SwitchStatement {
    public static void main(String[] args) {
        //Example2: Ask user the month name then print the month name from the given month name to the last month name
        //                  November ==>October,November,December
        Scanner input= new Scanner(System.in);
        System.out.println("Enter month name");
        String monthName=input.next();

        switch (monthName){
            case "January":
                System.out.println("February");
            case "February":
                System.out.println("February");
            case "March":
                System.out.println("February");
            case "April":
                System.out.println("February");
            case "May":
                System.out.println("February");
            case "June":
                System.out.println("February");
            case "July":
                System.out.println("February");
            case "August":
                System.out.println("February");
            case "September":
                System.out.println("February");
            case "October":
                System.out.println("October");
            case "Novemeber":
                System.out.println("February");
            case "December":
                System.out.println("February");
                //break;
                default:
                System.out.println("Invalid month name");
        }
    }
}
