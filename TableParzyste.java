package exercises;

import java.util.Arrays;
public class TableParzyste {
    public static void main(String[] args) {
        int[] intTab = new int[10];
        for (int i = 0; i < 10; i++) {
            if (i % 2 == 1) {
                intTab[i] = (-1);
            } else if (i % 2 == 0) {
                intTab[i] = i;
            } else System.out.println("Sth's wrong");
        }
        System.out.print(Arrays.toString(intTab));


    }
}
