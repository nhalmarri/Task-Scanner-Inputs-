import java.time.*;
//import java.util.*;
import java.time.LocalDate;
import java.util.Calendar;
//import java.util.Date;
import java.util.Scanner;
class calculateAge {

    // i found this method online after a long search :)
    static void find(LocalDate first_date, LocalDate second_date)
    {

        Period difference = Period.between(first_date, second_date);

        System.out.print("Difference between two dates is:\n");
        System.out.printf( "%d days, %d months and %d years",
                difference.getDays(),
                difference.getMonths(),
                difference.getYears());

    }

    // Main class
    public static void main(String[] args)
    {
        Scanner input = new Scanner( System.in);
        System.out.println("When is Your Birthday? (DD MM YYYY) ");
        int birthDay = input.nextInt();
        int birthMonth = input.nextInt();
        int birthYear = input.nextInt();

        Calendar calendar = Calendar.getInstance();

        Calendar birthDayCalendar = Calendar.getInstance();
        birthDayCalendar.set(Calendar.YEAR, birthYear);
        birthDayCalendar.set(Calendar.MONTH, birthMonth-1);
        birthDayCalendar.set(Calendar.DAY_OF_MONTH, birthDay);


        LocalDate first_date = LocalDate.of(birthYear, birthMonth, birthDay);
        LocalDate second_date = LocalDate.now();


        find(first_date, second_date);


    }//end og main
}