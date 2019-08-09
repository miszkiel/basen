package exercises;

public class Pies {
    public static int iloscPsow = 5 ;
    public static void main(String[] args){

        String pies1 = "Labrador";
        String pies2 = "Kundel";

        // Tu definiujesz zmienna klasy Pies o nazwie ilość.
        // Łaskawie zauważ jednak, że nie ma ona żadnej wartości, a powinna mieć wartość klasy Pies.
        Pies ilosc = new Pies();

        int iloscPs = 2;

        System.out.println("Psy to: "+pies1+", "+pies2);

        // Tu wyświetlamy tekstową reprezentację obiektu.
        // Dla zmienej typu string to jest po prostu napis.
        // Tak samo dla zmiennej typu int (iloscPs), wyswietli liczbę czyli 2 bo tyle wpisałam a iloscPsow = 5.
        // Inaczej ze zmienną klasy Pies, tu już dostaniesz nazwę klasy i wartość skrótu obiektu: Pies@1b6d3586
        System.out.println(pies1);
        System.out.println(pies2.toString());

        System.out.println(ilosc.toString());
        System.out.println(iloscPsow);

    }
}
