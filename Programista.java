package konstruktory;

public class Programista {

    //Spróbuj stworzyć klasę, która posiadała będzie pola reprezentujące każdy z dostępnych w języku java typów podstawowych
    // Klasa ta powinna również zawierać jakieś pole o typie referencyjnym, konstruktor domyślny.

    private String imieInazwisko; /* to będzie obiekt */
    public boolean czyZnaJave;
    public byte ileMaLat;
    public short ileZnaJezykow;
    public int ileKodowNapisalWostatnimRoku;
    public long ileKawwWypilWostatnimRoku;
    public float sredniPrzychodMiesieczny;
    public double sredniPrzychodRoczny;
    public char jakiejKlasyPrawoJazdyMa;

    public boolean isCzyZnaJave (){
    return czyZnaJave;
    }
    public byte getIleMaLat(){
        return ileMaLat;
    }
    public short getIleZnaJezykow(){
        return ileZnaJezykow;
    }
    public int getIleKodowNapisalWostatnimRoku(){
        return ileKodowNapisalWostatnimRoku;
    }
    public long getIleKawwWypilWostatnimRoku(){
        return ileKawwWypilWostatnimRoku;
    }
    public float getSredniPrzychodMiesieczny(){
        return sredniPrzychodMiesieczny;
    }
    public double getSredniPrzychodRoczny(){
        return sredniPrzychodRoczny;
    }
    public char getJakiejKlasyPrawoJazdyMa(){
        return jakiejKlasyPrawoJazdyMa;
    }

    public String getImieInazwisko(){
        return imieInazwisko;
    }
    // Obiekt tylko dlatego że typ String?? Nie ma żadnych innych różnic...

}






