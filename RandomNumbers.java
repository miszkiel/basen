package exercises;

import java.util.Arrays;
import java.util.Random;
public class RandomNumbers {
    public static void main(String[] args){
        int[] randTab = new int [10];
        for (int i=0; i<randTab.length;i++) {
            Random randomGener = new Random();
            int nextInt = 5+randomGener.nextInt(10);
            randTab[i] = nextInt;
        }
            System.out.println("Tablica liczb losowych z przedziału 5-15" + Arrays.toString(randTab));


    }
}
