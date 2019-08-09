package exercises;

public class MainClass {
    public static void main(String[] args){
        User firstUser = new User("Jan", "Kowalski");
        User secondUser = new User("Ewa", "Nowak");

        firstUser.printFullName();
        secondUser.printFullName();

    }



}
