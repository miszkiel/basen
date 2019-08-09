package interfejsy;

public class MainCar {
    public static void main(String[] args){

        CanDrive canDrive = new Car();
        canDrive.drive();
        canDrive.fly();

        CanSwim canSwim = new Car();
        canSwim.swim();


    }
}
