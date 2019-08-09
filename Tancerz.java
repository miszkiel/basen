package konstruktory;

// Przeciążanie konstruktora ciąg dalszy

public class Tancerz {

    //Napisz klasę, która zawiera 6 różnych pól egzemplarza

    private String imie;
    private String nazwisko;
    private String krajPochodzenia;
    private char klasaTaneczna;
    private int jakDlugoTanczy;
    private boolean czyJestDobry;

    // stwórz dla niej konstruktor który przyjmuje 3 parametry wejściowe i inicjalizuje odpowiednie 3 pola.

    public Tancerz(String imie, String nazwisko, String krajPochodzenia){
        this.imie = imie;
        this.nazwisko = nazwisko;
        this.krajPochodzenia = krajPochodzenia;
    }
// Przeciąż konstruktor, który tym razem przyjmie 6 parametrów. Pamiętaj aby, w ciele konstruktora wywołać wcześniejszy konstruktor, aby nie powielać kodu.

    public Tancerz(String imie, String nazwisko, String krajPochodzenia, char klasaTaneczna, int jakDlugoTanczy, boolean czyJestDobry){
        this(imie,nazwisko,krajPochodzenia);
        this.klasaTaneczna = klasaTaneczna;
        this.jakDlugoTanczy = jakDlugoTanczy;
        this.czyJestDobry = czyJestDobry;

    }

}
