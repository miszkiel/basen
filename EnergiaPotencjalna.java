package exercises;

public class EnergiaPotencjalna {

    public static final double stalaGrawitacyjna = 9.81;

    public static void main(String[] args) {

        double masa = 50.5;
        double wysokosc = 15.3;

        double enPot = stalaGrawitacyjna * masa * wysokosc;

        System.out.println(enPot);


    }
}
