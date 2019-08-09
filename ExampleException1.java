package exceptionsAndErrors;

import java.util.Scanner;

public class ExampleException1 {

    public static void main(String []args){

        // W tej tablicy podaj słownie indeksy, które mają byc wupsiane na liście "q" aby zakończyć program,
        //np. "1", "2", "-10", "jeden", "10"

        String[] indexToPrint = new String[]{"1","2","3","10","jeden","q"};

        String[] strings = new String[]{"To","jest","bardzo","przydatny","kurs","."};


        for (int i = 0; i<100; i++){
            String next = indexToPrint[i];
            System.out.println("Pobrano wyraz: "+next);

            if (next.equals("q")){
                break;
            }

            int index = getIndex(strings, next);
            System.out.println("Wyraz o indeksie "+index+" to '"+strings[index]+"'");
        }


    }
    // Metoda generująca wyjątek typu unchecked

     public static int getIndex(String[] strings, String next){

        int index = Integer.valueOf(next);
        if (index<0){
            throw new IllegalArgumentException("Wprowadzona liczba musi być większa od 0!");

        }
        if (index>=strings.length){
            throw new IllegalArgumentException("Wprowadzona liczba musi być mniejsza od "+strings.length+" !");

        }
        return index;
        }

    // Metoda generująca wyjątek typu checked
/*
        public static int getIndex(String[] strings, String next) throws Exception{

            int index = Integer.valueOf(next);
            if (index<0){
                throw new IllegalArgumentException("Wprowadzona liczba musi być większa od 0!");

            }
            if (index>=strings.length){
                throw new IllegalArgumentException("Wprowadzona liczba musi być mniejsza od "+strings.length+" !");

            }
            return index;
        }

 */
}



