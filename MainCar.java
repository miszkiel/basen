package konstruktory;

import konstruktory.Car;

public class MainCar {

    public static void main(String[] args){

        Car car = new Car();

    }
}

/*
Konstruktor Steering Wheel wywołany.
Konstruktor Car wywołany.
Konstruktor SparkPlug wywołany.
Konstruktor Engine wywołany.
Konstruktor Cooler wywołany.

Każda z klas posiada konstruktor bezargumentowy, którego pierwszym zachowaniem jest wyświetlenie informacji o tym, że
zadany konstruktor rozpoczął swoje zadanie.
Pozwoli nam to prześledzić, kolejność wywoływania się konstruktorów. Oprócz powyższego, warto zauważyć, że pola o typie
“SteearingWheel” oraz “SparkPlug” inicjalizowane są bezpośrednio w momencie ich deklaracji. Reszta pól inicjalizowana
 jest przez konstruktor.


Pomimo że w sposób bezpośredni tworzymy obiekt klasy “Car” przy pomocy konstruktora bezargumentowego, konstruktor
 ten nie jest pierwszy na liście wywołań wynikowych. Dzieję się tak, ponieważ wirtualna maszyna javy przed wywołaniem
 konstruktora, inicjalizuje wszystkie pola, które zostały obarczone wartością, już w momencie deklaracji (tak jak
 “steeringWeel”). Dopiero po takim zabiegi JVM, przechodzi do wywołania docelowego konstruktora (w naszym przypadku
 “Car()”). Dalszy ciąg wynikowy, opiera się analogicznie o opisaną powyżej zasadę.
 */