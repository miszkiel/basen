package exercises;

import java.util.Arrays;
import java.util.Random;
import java.util.Arrays;

public class ArrayCopying1 {
    public static void main(String[] args){
        int[] srcArr = new int [10];
        int [] destArr = new int [10];

        // wypełnienie tablicy źródłowej liczbami losowymi
        for (int i=0; i<srcArr.length; i++) {
            Random randomGener = new Random();
            srcArr[i] = randomGener.nextInt(10);
        }

        //kopiowanie tablicy za pomocą metody arraycopy
        System.arraycopy(srcArr, 0, destArr, 0,(srcArr.length));

        System.out.println("Source: "+ Arrays.toString(srcArr));
        System.out.println("Destination: "+ Arrays.toString(destArr));
    }
}
