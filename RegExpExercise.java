package exercises;

import java.util.Arrays;

public class RegExpExercise {
    public static void main(String[] args){

        String exercise = "W  Szczebrzeszynie chrząszcz brzmi w trzcinie i Szczebrzeszyn z tego słynie.";

        // Czy w zdaniu są 2 spacje? Jeśli tak, wyświetl "Napis ma 2 spacje."
        if (exercise.matches(".*  .*") ) {
            System.out.println("Napis ma 2 spacje!");}
        else System.out.println("Nie ma 2 spacji!");


        //Zamień po2 spacje na pojedynczą

        String exercise2 = exercise.replaceAll("\\s{2,}", " ");
        System.out.println("Po usunięciu po2 spacji: "+exercise2);


        //Zamień zdanie tak żeby "i szczebrzeszyn z tego słynie" było w nowej linii; wyświetl zdanie po zmianach

         exercise2 = exercise2.replace("i Szczebrzeszyn", "\ni Szczebrzeszyn");
         System.out.println("Po złamaniu linii: "+exercise2);


        //Podziel tekst na wyrazy według spacji i wyświetl tablicę
         String[] tablica = exercise2.split(" ");
         System.out.println("Tablica podzielonych wyrazów: "+Arrays.toString(tablica));

    }

}
