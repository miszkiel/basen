package interfejsy;

public class Car implements CanDrive, CanSwim {

    @Override
    public void drive(){
        System.out.println("Autko jedzie.");
    }
    @Override
    public void start(){
        System.out.println("Autko wystartowało.");
    }

    @Override
    public void stop(){
        System.out.println("Autko stanęło.");
    }

    @Override
    public void turn(){
        System.out.println("Autko skręciło.");
    }

    @Override
    public void switchLights(){
        System.out.println("Zapaliły się światła.");
    }

    @Override
    public void swim(){
        System.out.println("Autko płynie prawie jak szczupak.");
    }

    @Override
    public void fly(){
        System.out.println("Autko leci jak bocian albo i dwa.");
    }



}
