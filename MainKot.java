package konstruktory;

import parkZeStawikiem.Kosz;

public class MainKot {

    public static void main(String[] args){

        Kot kot = new Kot();
        Kot kotek = new Kot();

        System.out.println( "Koty: "+kot+", "+kotek );
/* Wypisuje: Koty: konstruktory.Kot@1b6d3586, konstruktory.Kot@4554617c
Obiekty kot i kotek nie moga mieć przypisanych właściwości (rasa, czy ma wąsy) bo to właśnie zrobiłby konstruktor.
        */
    }
}
