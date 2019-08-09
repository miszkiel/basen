package exercises;

public class Main2 {

    public static void main(String[] args) {
        String text1 = new String("Test");
        String text2 = "Test";
        String text3 = "Te"+"st";

        if (text1.equals(text2)){
                System.out.println("1 i 2 są równe");
        }
        if (text1.equals(text3)){
            System.out.println("1 i 3 są równe");
        }
        if (text2.equals(text3)){
            System.out.println("2 i 3 są równe");
        }
    }
}
