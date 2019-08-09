package konstruktory;
//Przeciążanie konstruktorów 1//


public class Pomarancza {

    private String marka;
    private String krajPochodzenia;
    private float srednica;

  /*  public Pomarancza(String marka, String krajPochodzenia, float srednica){
        this.marka = marka;
        this.krajPochodzenia = krajPochodzenia;
        this.srednica = srednica;
    }

    public Pomarancza(String marka, String krajPochodzenia, double srednica){
        this.marka = marka;
        this.krajPochodzenia = krajPochodzenia;
        this.srednica = (float) srednica;
    } */

    public Pomarancza(String marka){
        this.marka = marka;
    }
    public Pomarancza(String marka, String krajPochodzenia, double srednica){
        this(marka);
        this.krajPochodzenia = krajPochodzenia;
        this.srednica = (float) srednica;
    }

}
