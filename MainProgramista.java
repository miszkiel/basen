package konstruktory;

// Stwórz egzemplarz tej klasy, wykorzystując konstruktor domyślny. Następnie wypisz wartości wszystkich pól na ekran konsoli.

import konstruktory.Programista;

public class MainProgramista {

    public static void main(String[] args){

        Programista programista = new Programista();

        //Obiekt:
        System.out.println( "Domyślna wartość zmiennej obiektowej imieInazwisko: " +programista.getImieInazwisko());

        //Typy podstawowe:
        System.out.println( "Domyślna wartość zmiennej boolean czyZnaJave:  "+programista.isCzyZnaJave());
        System.out.println( "Domyślna wartość zmiennej byte ileZnaJezykow: "+programista.getIleZnaJezykow() );
        System.out.println( "Domyślna wartość zmiennej short ileMaLat: "+programista.getIleMaLat() );
        System.out.println( "Domyślna wartość zmiennej int ileKodowNapisalWostatnimRoku: " +programista.getIleKodowNapisalWostatnimRoku());
        System.out.println( "Domyślna wartość zmiennej long ileKawwWypilWostatnimRoku: " +programista.getIleKawwWypilWostatnimRoku());
        System.out.println( "Domyślna wartość zmiennej float sredniPrzychodMiesieczny: " +programista.getSredniPrzychodMiesieczny());
        System.out.println( "Domyślna wartość zmiennej double sredniPrzychodRoczny: " +programista.getSredniPrzychodRoczny());
        System.out.println( "Domyślna wartość zmiennej char jakiejKlasyPrawoJazdyMa: " +programista.getJakiejKlasyPrawoJazdyMa());



        /* Czy wartości pokrywają się z tabelą, przedstawioną we wcześniejszej części kursu?

        Domyślna wartość zmiennej obiektowej imieInazwisko: null
        Domyślna wartość zmiennej boolean czyZnaJave:  false
        Domyślna wartość zmiennej byte ileZnaJezykow: 0
        Domyślna wartość zmiennej short ileMaLat: 0
        Domyślna wartość zmiennej int ileKodowNapisalWostatnimRoku: 0
        Domyślna wartość zmiennej long ileKawwWypilWostatnimRoku: 0
        Domyślna wartość zmiennej float sredniPrzychodMiesieczny: 0.0
        Domyślna wartość zmiennej double sredniPrzychodRoczny: 0.0
        Domyślna wartość zmiennej char jakiejKlasyPrawoJazdyMa:

        Dla char nie wyświetliło się nic a powinno \u0000
         */




    }
}
