package exercises;

import java.util.Arrays;
import java.util.Random;
public class ArrayCopying {
    public static void main(String[] args){
        int[] srcArr = new int [10];
        int [] destArr = new int [10];

        // wypełnienie tablicy źródłowej liczbami losowymi
        for (int i=0; i<srcArr.length; i++) {
            Random randomGener=new Random();
            srcArr[i]=randomGener.nextInt(10);
            //wypełniam od razu drugą tablicę i już :)
            destArr[i]=srcArr[i];
        }
     System.out.println("Source: "+ Arrays.toString(srcArr));
     System.out.println("Destination: "+ Arrays.toString(destArr));
    }
}
