package parkZeStawikiem;

import java.util.Arrays;

public class Park {

    private String nazwa;
    private String godziny;
    private Alejka[] alejkas;
    private Staw staw;

    public Park(String nazwa, String godziny){
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

    public Alejka[] getAlejkas(){
        return alejkas;
    }
    public void setAlejkas(Alejka[] alejkas){
        this.alejkas = alejkas;
    }

    public Staw getStaw(){
        return staw;
    }
    public void setStaw(Staw staw){
        this.staw = staw;
    }

    @Override
    public String toString(){
        return "Park "+nazwa+" otwarty jest w godzinach: "+godziny+". Ma takie alejki: "+Arrays.toString(alejkas)+" . Park położony jest przy stawiku "+staw+".";
    }
}
