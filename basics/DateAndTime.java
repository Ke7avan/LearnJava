package basics;
import java.util.*;
import java.time.*;

public class DateAndTime {
    public static void main(String args[]) {
        //gets current date and time
        Date now = new Date();
        System.out.println(now);
        //bulk calender with properties
        Calendar calendar = Calendar.getInstance();
        System.out.println(calendar.NOVEMBER);
        //gets current date
        LocalDate today = LocalDate.now();
        System.out.println("Today : " + today);
        //gets current time
        LocalTime thisTime = LocalTime.now();
        System.out.println("This time : " + thisTime);
        //gets current date and time
        LocalDateTime currentDateTime = LocalDateTime.now();
        System.out.println("Current Time : " + currentDateTime);
        //create data with manual info
        LocalDate someDay = LocalDate.of(2020, Month.JUNE, 12);
        System.out.println("Someday : " + someDay);
        //create time with manual info
        LocalTime someTime = LocalTime.of(23, 53);
        System.out.println("Sometime : " + someTime);
        //create date and time with manual info
        LocalDateTime otherDateTime = LocalDateTime.of(2021, Month.MARCH, 4, 10,51,44);
        System.out.println("Other Date Time : " + otherDateTime);
        //extract year = month = hour
        System.out.println("Get year : " + otherDateTime.getYear());
        System.out.println("Get month : " + otherDateTime.getMonth());
        System.out.println("Get hour : " + otherDateTime.getHour());
        //operations with date and time
        LocalDateTime currentDateAndTime = LocalDateTime.now();
        LocalDateTime futureDateTime = currentDateAndTime.plusYears(1).plusDays(2).plusHours(3);
        boolean isBefore = futureDateTime.isBefore(currentDateAndTime); //false
        boolean isAfter = futureDateTime.isAfter(currentDateAndTime); //true
        System.out.println(isBefore);
        System.out.println(isAfter);
    }
}