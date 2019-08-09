package parkZeStawikiem;

public class Alejka {

    private String nazwa;
    private int numer;
    private Kosz kosz;
    private Lawka lawka;

    public Alejka(String nazwa, int numer){
        this.nazwa = nazwa;
        this.numer = numer;
    }

    public String getNazwa(){
        return nazwa;
    }
    public void setNazwa(String nazwa){
        this.nazwa = nazwa;
    }

    public int getNumer(){
        return numer;
    }
    public void setNumer(int numer){
        this.numer = numer;
    }

    public Kosz getKosz(){
        return kosz;
    }
    public void setKosz(Kosz kosz){
        this.kosz = kosz;
    }

    public Lawka getLawka(){
        return lawka;
    }
    public void setLawka(Lawka lawka){
        this.lawka = lawka;
    }

    @Override
    public String toString(){
        return "Alejka numer " + numer + " o nazwie " +  nazwa + " ma kosz na śmieci o kolorze " + kosz + " i lawki o kolorze " + lawka;
    }

}
