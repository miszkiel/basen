package kolekcje;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class zadanie1 {

    //Masz listę typu List<Integer> gdzie wprowadzasz powtarzające się wartości:
    //{20,20,31,30,34,30,40,43,40,20,10,11,20,30}.
    //
    //Przy pomocy iteratora (pętla forEach) przepisz tę listę do kolekcji typu Set<Integer>.
    // Wydrukuj na ekranie zawartość obydwu kolekcji. Zobacz czy z kolekcji typu Set zostały usunięte duplikaty.

    public static void main(String[] args) {

        int[] listInt =  {20,20,31,30,34,30,40,43,40,20,10,11,20,30};

        // Konwersja listy na kolekcję integerList
        List<Integer>integerList =  new ArrayList<>(listInt.length);

        for (int i : listInt){
            integerList.add(Integer.valueOf(i));
        }
        System.out.println("Kolekcja List:");
        System.out.println(integerList.toString());
        System.out.println();

        //Przy pomocy forEach przepisz tę listę do kolekcji typu Set<Integer>.
        Set<Integer> integersSet = new HashSet<Integer>();

        for (Integer integer : integerList) {
            integersSet.add(integer);
        }
        System.out.println("Kolekcja Set:");
        System.out.println(integersSet.toString());
        System.out.println();

    }

}
/*Kolekcja List:
[20, 20, 31, 30, 34, 30, 40, 43, 40, 20, 10, 11, 20, 30]

Kolekcja Set:
[34, 20, 40, 10, 43, 11, 30, 31]
*/
