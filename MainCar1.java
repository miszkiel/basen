package konstruktory;

/* Modyfikacja Car tak by żadne pole nie było inicjalizowane w momencie deklaracji.
   Zamiast tego pola te mają być zainicjowane w konstruktorze.
   (czyli zmieniamy SparkPlug i SteeringWheel).

 */

public class MainCar1 {

    public static void main(String[] args){

        Car1 car1 = new Car1();

    }
}

/*
Konstruktor Car1 wywołany.
Konstruktor Engine1 wywołany.
Konstruktor Cooler wywołany.  (!!)
Konstruktor SparkPlug wywołany. (!!)
Konstruktor Steering Wheel1 wywołany.

Każda z klas posiada konstruktor bezargumentowy, którego pierwszym zachowaniem jest wyświetlenie informacji o tym, że
zadany konstruktor rozpoczął swoje zadanie.
Pozwoli nam to prześledzić, kolejność wywoływania się konstruktorów. Oprócz powyższego, warto zauważyć, że pola o typie
“SteearingWheel” oraz “SparkPlug” NIE SĄ JUZ inicjalizowane bezpośrednio w momencie ich deklaracji. Reszta pól inicjalizowana
 jest przez konstruktor, TE 2 ZMODYFIKOWANE TEŻ.

Przy kompilacji wywaliło błąd i żeby poszło, to obiekty cooler1 i sparkPlug1 nie są klas Cooler1 i SparkPlug1 a Cooler i
 SparkPlug (wersje bez modyfikacji no ale wyglądają identycznie...). Stąd te (!!) przy nich.

 Teraz już nie ma pól zawartościowanych w momencie deklaracji, wszystkie idą przez konstruktor.
 Stąd też obiekt klasy Car, będący wywołaniem docelowym konstruktora w klasie Main (a
 tworzony bezpośrednio przy użyciu konstruktora bezparametrowego) zostaje wywołany jako pierwszy.
 W Car jest odniesienie do Engine (w którym jesy Cooler i SparkPlug), i do Steering Wheel.
 Stąd kolejność. KONIEC.


 */