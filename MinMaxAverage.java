package exercises;

import java.util.Arrays;
public class MinMaxAverage {

    public static void main(String[] args){
        int[] tablica = new int[] {20, 10,13,30,100,20,102,4,10,17};
        int min = Integer.MAX_VALUE;
        int max =  Integer.MIN_VALUE;
        float suma = 0;

        for (int i=0; i<tablica.length; i++){
            suma=suma+tablica[i];

            if (tablica[i]< min)
                    min=tablica[i];
            else if (tablica[i]> max)
                    max= tablica[i];

        }
        float average = suma/tablica.length;
        System.out.println("Tablica: "+Arrays.toString(tablica));
        System.out.println("Min: "+min+", Max: "+max+", Average: "+average);
    }
}
