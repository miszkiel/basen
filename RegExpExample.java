package exercises;

import java.util.Arrays;
public class RegExpExample {
    public static void main(String [] args){

        String example = "Hello World, it's world of RegExp";

        //Szukanie słów w tekście
        System.out.println("Czy występuje słowo 'World': "+example.matches("World"));
        System.out.println("Czy występuje słowo 'World': "+example.matches(".*World.*"));
        System.out.println("Czy jest litera 'a': "+example.matches(".*a"));
        System.out.println("Czy jest litera 'o': "+example.matches(".*o?"));

        //Zamiana tekstu
        System.out.println("Zamiana pierwszego słowa 'World' na 'mooooo"+example.replace("World", "mooooo"));
        System.out.println("Zamiana wszystkich liter 'o' na 'a': "+example.replace('o', 'a'));

        //Zamiana słów w tekście
        System.out.println("Zamiana wszystkich słów 'World' i 'world' na 'mooooo': "+example.replaceAll("[Ww]orld", "mooooo"));

        //Podział tekstu na wyrazy
        String[] split1 = example.split(" ");
        System.out.println("Tablica po podziale według znaku spacji: "+Arrays.toString(split1));

        String[] split2 = example.split(",");
        System.out.println("Tablica po podziale według przecinka: "+Arrays.toString(split2));


    }
}
