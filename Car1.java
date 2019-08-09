package konstruktory;

public class Car1 {

    private Engine1 engine1;
    private SteeringWheel1 steeringWheel1;
    //private SteeringWheel steeringWheel = new SteeringWheel();

    public Car1(){
        System.out.println( "Konstruktor Car1 wywołany." );
        this.engine1 = new Engine1();
        this.steeringWheel1 = new SteeringWheel1();
    }
}
