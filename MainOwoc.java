package exercises;

import java.util.Objects;

public class MainOwoc {
    public static void main (String[] args){

        Owoc owocJapko = new Owoc("Jabłko", "czerwony", "okrągły");
        Owoc owocBanan = new Owoc("Banan", "żółty", "podłużny");
        Owoc owocJablko = new Owoc("Jabłko", "czerwony", "okrągły");

        String nazwaJablka = owocJablko.nazwaOwocu;
        String nazwaJapka = owocJapko.nazwaOwocu;

        System.out.println("Ilość owoców wynosi "+ Owoc.przypiszIloscOwocow()+".");
        owocJapko.wypiszOpisOwocu();
        owocBanan.wypiszOpisOwocu();
        owocJablko.wypiszOpisOwocu();

        // Wypisz textowy opis obiektów
        System.out.println("Pole bananowe: "+owocBanan);
        System.out.println("Pole japkowe: "+owocJapko.toString());

        // Sprawdź czy 2 obiekty klasy Owoc są sobie równe (nie są!)
        boolean checkObj1 = owocJablko.equals(owocJapko);
        System.out.println("Obiekty: Japko = Jablko --> "+checkObj1);

        // Sprawdź czy 2 zmienne typu klasy Owoc są sobie równe (są!)
        boolean checkVar1 = nazwaJablka.equals(nazwaJapka);
        System.out.println("Zmienne nazw owoców: Japko = Jablko --> "+ checkVar1);

        // Wypisz hashCode'y dla obiektów owocJapko, owocBanan, owocJablko
        System.out.println("hashCode dla Japka: "+owocJapko.hashCode());
        System.out.println("hashCode dla Jablka: "+owocJablko.hashCode());
        System.out.println("hashCode dla Banana: "+owocBanan.hashCode());

    }
}
