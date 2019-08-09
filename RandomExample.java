package exercises;

import java.util.Random;
public class RandomExample {
    public static void main(String[] args){
        Random randomGenerator = new Random();
        int nextInt = randomGenerator.nextInt(10);
        System.out.println("Losowa liczba: "+ nextInt);
    }
}