package dateAndTime;

import java.time.LocalDate;
import java.time.LocalDateTime;

public class DateAndTime {

    public static void main(String[] args){

        LocalDateTime dateTime1 = LocalDateTime.now();
        LocalDateTime dateTime2 = LocalDateTime.of(2015,10,25,4,33,11);
        LocalDateTime dateTime3 = LocalDateTime.parse("2018-06-21T19:43:25");

        System.out.println("now(): "+dateTime1);
        System.out.println("of(...): "+dateTime2);
        System.out.println("parse(...): "+dateTime3);
        System.out.println();


    }

}
/*
now(): 2019-08-04T16:45:41.631
of(...): 2015-10-25T04:33:11
parse(...): 2018-06-21T19:43:25

 */