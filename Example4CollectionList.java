package kolekcje;
import java.util.ArrayList;
import java.util.List;

public class Example4CollectionList {

    public static void main(String[] args){

        //Utworzenie pustej listy
        List<String> stringList = new ArrayList<>();

        //Wypełnienie listy elementami
        stringList.add("Jeden");
        stringList.add("Dwa");
        stringList.add("Trzy");
        stringList.add("Cztery");
        stringList.add(3,"Dwa");
        stringList.add(3,"Pięć");
        stringList.add(4, "Sześć");

        //Wyświetlenie zawartości tablicy przy pomocy pętli forEach
        for (String numbers : stringList){
            System.out.println(numbers);
        }


        //Pobranie z listy elementu o danym indeksie
        System.out.println("W liście na pozycji 0 jest "+ stringList.get(0));
        System.out.println("W liście na pozycji 3 jest "+stringList.get(3));

        //Pobranie indeksu danego elementu
        System.out.println("Na tej liście słowo 'Trzy' jest na pozycji "+stringList.indexOf("Trzy") );
        System.out.println("Na tej liście słowo 'Pięć' jest na pozycji "+stringList.indexOf("Pięć"));

        //Wyświetlenie ilości elementów na liście
        System.out.println("Ta lista zawiera "+stringList.size()+" elementów.");

        //Usunięcie elementu z listy
        stringList.remove("Pięć");

        //Wyświetlenie zawartości listy przy pomocy przeciążonej metody toString()
        System.out.println(stringList.toString());


    }

/*
Jeden
Dwa
Trzy
Pięć
Sześć
Dwa
Cztery
W liście na pozycji 0 jest Jeden
W liście na pozycji 3 jest Pięć
Na tej liście słowo 'Trzy' jest na pozycji 2
Na tej liście słowo 'Pięć' jest na pozycji 3
Ta lista zawiera 7 elementów.
[Jeden, Dwa, Trzy, Sześć, Dwa, Cztery]

 */


}
