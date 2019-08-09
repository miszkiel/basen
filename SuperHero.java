package interfejsy;

import com.sun.xml.internal.bind.annotation.OverrideAnnotationOf;

public class SuperHero implements CanSwim, CanFly {

    @Override
    public void fly(){
        System.out.println("Superhero flying!");
    }

    @Override
    public void swim(){
        System.out.println("Superhero swimming!");
    }






    /*private static SuperHero ourInstance = new SuperHero();

    public static SuperHero getInstance() {
        return ourInstance;
    }

    private SuperHero() {
    }

     */
}
