package konstruktory;

public class Engine1 {

    private Cooler cooler1;
    private SparkPlug sparkPlug1;
    //private SparkPlug sparkPlug = new SparkPlug();


    public Engine1(){
        System.out.println( "Konstruktor Engine1 wywołany." );

         this.cooler1 = new Cooler();
         this.sparkPlug1 = new SparkPlug();

    }
}
