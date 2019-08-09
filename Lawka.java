package parkZeStawikiem;

public class Lawka {

    private String kolor;
    private int wielkosc;
    private boolean drewniana;

    public Lawka(String kolor, int wielkosc, boolean drewniana){
        this.kolor = kolor;
        this.wielkosc = wielkosc;
        this.drewniana = drewniana;
    }

    public String getKolor(){
        return kolor;
    }
    public void setKolor(String kolor){
        this.kolor = kolor;
    }

    public int getWielkosc(){
        return wielkosc;
    }
    public void setWielkosc(int wielkosc){
        this.wielkosc = wielkosc;
    }

    public boolean getDrewniana(){
        return drewniana;
    }
    public void setDrewniana(boolean drewniana){
        this.drewniana = drewniana;
    }

    @Override
    public String toString(){
        return kolor;
    }
}
