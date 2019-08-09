package exercises;

import jdk.management.resource.internal.inst.DatagramDispatcherRMHooks;

import java.util.Random;


public class Owoc {

    //Pole klasy
    public static int iloscOwocow;

    //Pole obiektów
    public String nazwaOwocu;
    public String kolorOwocu;
    public String ksztaltOwocu;

    //Konstruktor


    public Owoc(String nazwaOwocu, String kolorOwocu, String ksztaltOwocu){
        this.nazwaOwocu = nazwaOwocu;
        this.kolorOwocu = kolorOwocu;
        this.ksztaltOwocu = ksztaltOwocu;
    }

    //Metody klasy
    public static int przypiszIloscOwocow(){

        Random randNum = new Random();
        int ilosc = randNum.nextInt(100000);
        return ilosc;

    }

    //Metody obiektów
    public void wypiszOpisOwocu(){
        System.out.println(nazwaOwocu+" ma kolor "+kolorOwocu+" a kształt "+ksztaltOwocu+".");

    }
}
