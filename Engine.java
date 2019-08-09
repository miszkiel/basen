package konstruktory;

public class Engine {

    private Cooler cooler;
    private SparkPlug sparkPlug = new SparkPlug();

    public Engine(){
        System.out.println( "Konstruktor Engine wywołany." );
         this.cooler = new Cooler();

    }
}
