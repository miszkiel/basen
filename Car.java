package konstruktory;

public class Car {

    private Engine engine;
    private SteeringWheel steeringWheel = new SteeringWheel();

    public Car(){
        System.out.println( "Konstruktor Car wywołany." );
        this.engine = new Engine();
    }
}
