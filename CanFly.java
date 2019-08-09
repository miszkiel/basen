package interfejsy;

public interface CanFly {
    public void fly();

    public default void flyAway(){
        System.out.println("Wziął i odleciał!");
    }
}
