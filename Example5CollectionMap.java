package kolekcje;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;


public class Example5CollectionMap {

    public static void main(String[] args){

        //Utworzenie obiektu Map
        Map<String, String> stringMap = new HashMap<>();

        //Wypełnienie mapy elementami
        stringMap.put("1", "Jeden");
        stringMap.put("2", "Dwa");
        stringMap.put("3", "Trzy");
        stringMap.put("4", "Cztery");

        //Przejście po wszystkich elementach mapy i wypisanie ich
        Set<String> keySet = stringMap.keySet();
        for (String key:keySet){
            System.out.println("Klucz: "+key+"; wartość" +stringMap.get(key));
        }
        //Sprawdzenie czy mapa zawiera klucz
        System.out.println("Mapa zawiera klucz 1: "+stringMap.containsKey("1"));
        System.out.println("Mapa zawiera klucz 10: "+stringMap.containsKey(10));

        //Sprawdzenie czy mapa zawiera wartość
        System.out.println("Mapa zawiera wartość 'Jeden' "+stringMap.containsValue("1"));
        System.out.println("Mapa zawiera wartość 'Pięć' "+stringMap.containsValue("5"));

        //Wyświetlenie zawartości mapy przy pomocy przeciążonej metody toString()
        System.out.println(stringMap.toString());

        //Użycie mapy do zamiany tekstu w stringu
        String message = "1, 2, 3. Start. Programujemy coraz lepiej...";
        System.out.println("Oryginalny komunikat: "+message);

        Set<String> words = stringMap.keySet();
        for (String word:words){
            message = message.replace(word, stringMap.get(word));
        }

        System.out.println("Komunikat po zmianie "+message
        );

    }

}
/*
Klucz: 1; wartośćJeden
Klucz: 2; wartośćDwa
Klucz: 3; wartośćTrzy
Klucz: 4; wartośćCztery
Mapa zawiera klucz 1: true
Mapa zawiera klucz 10: false
Mapa zawiera wartość 'Jeden' false
Mapa zawiera wartość 'Pięć' false
{1=Jeden, 2=Dwa, 3=Trzy, 4=Cztery}
Oryginalny komunikat: 1, 2, 3. Start. Programujemy coraz lepiej...
Komunikat po zmianie Jeden, Dwa, Trzy. Start. Programujemy coraz lepiej...
 */