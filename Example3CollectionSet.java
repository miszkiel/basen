package kolekcje;

import java.util.HashSet;
import java.util.Set;

public class Example3CollectionSet {

    public static void main(String[] args){

        //Dodanie elementów do kolekcji
        Set<String> strings = new HashSet<>();
        strings.add("Jeden");
        strings.add("Dwa");
        strings.add("Dwa");
        strings.add("Trzy");
        strings.add("Cztery");
        strings.add("Cztery");

        //Wyświetlanie zawartości kolekcji
        System.out.println("Ilość elementów w tej kolekcji wynosi "+strings.size());

        //Sprawdzenie czy występuje dany element
        System.out.println("Czy w tej kolekcji występuje wyraz 'Dwa'? "+strings.contains("Dwa"));

        //Usunięcie wyrazu/elementu "Dwa"
        strings.remove("Dwa");
        System.out.println("Teraz wykonałem strings.remove(\"Dwa\")");
        System.out.println("Czy w tej kolekcji występuje wyraz 'Dwa'? "+strings.contains("Dwa"));

        System.out.println("Czy w tej kolekcji występuje wyraz 'Adam'? "+strings.contains("Dwa"));

        //Sprawdzenie czy kolekcja jest pusta
        System.out.println("Czy ta kolekcja jest pusta? "+strings.isEmpty());

        //Wyczyszczenie kolekcji
        strings.clear();
        System.out.println("Czy kolekcja jest pusta po zastosowaniu metody 'clear'? "+strings.isEmpty());



    }
}
/*
Ilość elementów w tej kolekcji wynosi 4
Czy w tej kolekcji występuje wyraz 'Dwa'? true
Teraz wykonałem strings.remove("Dwa")
Czy w tej kolekcji występuje wyraz 'Dwa'? false
Czy w tej kolekcji występuje wyraz 'Adam'? false
Czy ta kolekcja jest pusta? false
Czy kolekcja jest pusta po zastosowaniu metody 'clear'? true
 */