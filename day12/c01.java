package day12;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.ZoneId;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

public class c01 {
    public static void main(String[] args) {
        //How to get local date from Java
        LocalDate myDate = LocalDate.now();// Obtains the current date from the system clock in the default time-zone
        System.out.println(myDate);// 2023-07-17

        //How to go future and past
        LocalDate yourDate = myDate.plusMonths(3).plusDays(11).plusYears(5);// Method Chain
        System.out.println(yourDate);// 2028-10-28

        LocalDate ourDate = myDate.minusYears(2).minusMonths(10).minusDays(45);
        System.out.println(ourDate);// 2020-08-03

        //How to format Date
        //Example 1:
        DateTimeFormatter dtf = DateTimeFormatter.ofPattern("MM/dd/yyyy");
        String formattedMyDate = dtf.format(myDate);
        System.out.println(formattedMyDate);// 07/17/2023

        //Example 2:

        DateTimeFormatter dt = DateTimeFormatter.ofPattern("MM/dd/yyyy");
        String myDateFormatted = dt.format(myDate);

        System.out.println("myDateFormatted=" + myDateFormatted);

        //Example 3 :

        DateTimeFormatter d = DateTimeFormatter.ofPattern("dd MMMM yyyy");
        String myDateFormat = d.format(myDate);

        System.out.println("myDateFormat=" + myDateFormat);

        // How to see a different time zone

        LocalDate dateinJapan = LocalDate.now(ZoneId.of("Asia/Tokyo"));
        System.out.println("dateinJapan=" + dateinJapan);

        LocalDate dateInIstanbul = LocalDate.now(ZoneId.of("Europe/Istanbul"));
        System.out.println("dateInIstanbul=" + dateInIstanbul);


        //How to get LocalTime from Java

        LocalTime myTime = LocalTime.now();
        System.out.println("myTime=" + myTime);

        //How to get to a future time

        LocalTime yourTime = myTime.plusHours(1).plusMinutes(25).plusSeconds(13);
        System.out.println("YourTime=" + yourTime);

        //How to get to past date

        LocalTime outTime = myTime.minusNanos(2000);
        System.out.println("ouTime=" + outTime);

        //How to format time

        DateTimeFormatter f1 = DateTimeFormatter.ofPattern("HH:mm");

        String t1 = f1.format(myTime);
        System.out.println("t1=" + t1);

        //How to get time another time zone

        LocalTime timeInJapan = LocalTime.now(ZoneId.of("Asia/Tokyo"));
        System.out.printf("timeInJapan=" + timeInJapan);

        LocalDateTime myDateTime = LocalDateTime.now();
        System.out.println("myDateTime=" + myDateTime);

        System.out.println(myDateTime.getMonth());
        System.out.println(myDateTime.getDayOfWeek());
        System.out.println(myDateTime.getMonthValue());


        //Example 4 :
        //
        //
        //

        Scanner input =new Scanner(System.in);
        System.out.println("Enter year,month,day values");

        int year=input.nextInt();
        int month=input.nextInt();
        int day=input.nextInt();

        LocalDate givenDate = LocalDate.of(year,month,day );
        LocalDate currentDate = LocalDate.now();
        System.out.println("Enter the hour you want to reserve ");
        int hour=input.nextInt();
        int minute=input.nextInt();

        LocalTime givenTime = LocalTime.of(hour,minute );
        LocalTime currentTime = LocalTime.now();

        if (givenDate.isBefore(currentDate)) {
            System.out.println("Invalid date");

        } else if (givenDate.isEqual(currentDate)) {
            System.out.println("Give the time");

            if (givenTime.isBefore(currentTime)) {


            } else
                System.out.println("There si just 1 ticket");


        }else  if (givenDate.isAfter(currentDate)){
            System.out.println("Buy the ticket");

        }
    }
}

