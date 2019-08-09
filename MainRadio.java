package exercises;

// Domyślna inicjalizacja typu referencyjnego null


public class MainRadio {

    public static void main(String[] args){

        // Wywołanie konstruktora domyślnego:

        Radio radio = new Radio();

        /* Powyżej został utworzony obiekt radio klasy radio.
        To pole nie ma przypisanych żadnych wartości (bo konstruktor domyslny)
        więc wywołanie (jak poniżej: radio.getNazwa() ) podaje wartość null.

        */


        System.out.println( "Domyślna inicjalizacja typu referencyjnego: " +radio.getNazwa());

        /*         Musi być tak jak powyżej bo kiedy napiszemy coś takiego:
        System.out.println( "Domyślna inicjalizacja typu referencyjnego: " +nazwa;
        to się nie skompiluje, będzie błąd że cannot resolve nazwa.
        */


    }
}
