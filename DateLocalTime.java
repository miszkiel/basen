package dateAndTime;

import java.time.LocalDate;

public class DateLocalTime {

    public static void main(String[]args){

        LocalDate nowDate = LocalDate.now();
        LocalDate ofDate = LocalDate.of(2010,01,30);
        LocalDate parseDate = LocalDate.parse("2013-11-02");

        System.out.println("now() "+nowDate);
        System.out.println("of(...): "+ofDate);
        System.out.println("parse(...) "+parseDate);
        System.out.println();

        LocalDate sourceDate = LocalDate.parse("2018-01-01");

        LocalDate date1 = sourceDate.plusDays(5);
        LocalDate date2 = sourceDate.minusDays(5);
        LocalDate date3 = sourceDate.minusMonths(6);
        LocalDate date4 = sourceDate.plusMonths(6);

        // !!! az utworzony obiekt klasy “LocalDate” nie może być już później modyfikowany, dlatego wynik działania
        // metod na zmiennej “sourceDate” za każdym razem przypisywany jest do nowego obiektu. !!!

        System.out.println("Date 1: "+date1);
        System.out.println("Date 2: "+date2);
        System.out.println("Date 3: "+date3);
        System.out.println("Date 4: "+date4);
        System.out.println();

        System.out.println("Is date1 after date2? "+date1.isAfter(date2));
        System.out.println("Is date1 before date 2? "+date1.isBefore(date2));
        System.out.println();

        System.out.println("Day of  week for date1 is "+date1.getDayOfWeek());
        System.out.println("Day of  month for date1 is "+date1.getDayOfMonth());
        System.out.println("Day of year for date1 is "+date1.getDayOfYear());
        System.out.println();

        System.out.println("Czy rok daty 1 czyli "+date1.getYear()+" jest przestępny? "+date1.isLeapYear());
        System.out.println("Czy rok daty 2 czyli "+date2.getYear()+" jest przestępny? "+date2.isLeapYear());
        System.out.println("Czy rok daty 3 czyli "+date3.getYear()+" jest przestępny? "+date3.isLeapYear());
        System.out.println("Czy rok daty 4 czyli "+date4.getYear()+" jest przestępny? "+date4.isLeapYear());
        System.out.println();




    }

}
/*
now() 2019-08-04
of(...): 2010-01-30
parse(...) 2013-11-02

Date 1: 2018-01-06
Date 2: 2017-12-27
Date 3: 2017-07-01
Date 4: 2018-07-01

Is date1 after date2? true
Is date1 before date 2? false

Day of  week for date1 is SATURDAY
Day of  month for date1 is 6
Day of year for date1 is 6

Czy rok daty 1 czyli 2018 jest przestępny? false
Czy rok daty 2 czyli 2017 jest przestępny? false
Czy rok daty 3 czyli 2017 jest przestępny? false
Czy rok daty 4 czyli 2018 jest przestępny? false


 */
