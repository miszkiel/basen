package exercises;

import java.awt.*;

public class User {

    public static int personCounter;
    private String firstName;
    private String lastName;

    public User(String firstName){
        this.firstName = firstName;
    }

    public User(String firstName, String lastName){
        this.firstName = firstName;
        this.lastName = lastName;
    }

    public static double generateRandomUserId() {
        return Math.random()*1000+1;
    }

    public void printFullName() {
        System.out.println(firstName+" "+lastName);
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName(){
        return lastName;
    }
}
