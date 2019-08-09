package interfejsy;

public interface CanDrive extends CanFly {

    public void drive();
    public void start();
    public void stop();
    public void turn();
    public void switchLights();

    public default void driveStraight(){
        System.out.println("Jedzie przed siebie z równą prędkością");
    }

    public default void startNow(){
        System.out.println("Startuje w tej chwili.");
    }


}
