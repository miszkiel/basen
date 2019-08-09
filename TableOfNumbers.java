package exercises;

import java.util.Arrays;
public class TableOfNumbers {
    public static void main(String[] args) {
        int[] intTab = new int[10];
        for (int i = 0; i < 10; i++) {
            if (i % 2 == 1) {
                intTab[i] = i;
            } else if (i % 2 == 0) {
                intTab[i] = (i + 1);
            } else System.out.println("Sth's wrong");
        }
        System.out.print(Arrays.toString(intTab));


    }
}

