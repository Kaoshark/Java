package day12;

import java.time.LocalDate;
import java.util.Scanner;

public class c02 {
    public static void main(String[] args) {

        //Ask user to enter his date of birth then tell user the day name

        Scanner input=new Scanner(System.in);

        System.out.println("Enter the year, month and day number for you r date of birth");

        int year=input.nextInt();
        int month=input.nextInt();
        int day=input.nextInt();

        LocalDate dob=LocalDate.of(year,month,day);

        System.out.println("You were born "+ dob.getDayOfWeek());


    }
}
