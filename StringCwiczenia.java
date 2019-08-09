package exercises;

import java.util.Arrays;

public class StringCwiczenia {
    public static void main(String[] args){

        String tel = "+11-123-123-1234";
        if (tel.matches("[+]?[0-9]{0,2}[-.]?[0-9]{3}[-.]?[0-9]{3}[-.]?[0-9]{4}")) {
            System.out.println("Numer "+tel+" prawidłowy");
        }

        String strona = "https://www.connectis.pl/contact";
        if (strona.matches("(https?|ftp|file)://[-A-Z0-9+&@#/%?=~_|!:,.;]*[-A-Z0-9+&@#/%=~_|]")) {
            System.out.println("Jest adres");
        }
        else System.out.println("Nieprawidłowe wyrażenie!");

        String kodpocztowy = "23-321";
        if (kodpocztowy.matches("[0-9]{2}[-][0-9]{3}")){
            System.out.println("Kod pocztowy zwalidowany");
        }
        else System.out.println("Brak walidacji");



    }


}
