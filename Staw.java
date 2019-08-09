package parkZeStawikiem;

public class Staw {

    private String nazwa;
    private String godziny;
    private Park park;

    public Staw(String nazwa, String godziny){
        this.nazwa = nazwa;
        this.godziny = godziny;
    }

    public String getNazwa(){
        return nazwa;
    }
    public void setNazwa(String nazwa){
        this.nazwa = nazwa;
    }
    public String getGodziny(){
        return godziny;
    }
    public void setGodziny(String godziny){
        this.godziny = godziny;
    }

    public Park getPark(){
        return park;
    }
    public void setPark(Park park){
        this.park = park;
    }

    @Override
    public String toString(){
        return nazwa;
    }


}
