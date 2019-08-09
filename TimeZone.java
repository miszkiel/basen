package dateAndTime;

import java.time.ZoneId;
import java.util.Iterator;
import java.util.Set;

public class TimeZone {


    public static void main(String[] args){

        ZoneId zone1 = ZoneId.of("Europe/London");
        ZoneId zone2 = ZoneId.of("Europe/Warsaw");
        ZoneId zone3 = ZoneId.of("GMT");
/*
    Wszystkie dostępne identyfikatory stref czasowych, możesz znaleźć wywołując metodę statyczną klasy “ZoneId” o nazwie
    “getAvailableZoneIds()”.
 */
    Set<String> availableZoneIds = ZoneId.getAvailableZoneIds();
        Iterator<String> setIterator = availableZoneIds.iterator();

        while (setIterator.hasNext()){
            System.out.println(setIterator.next());


        }


    }
}
