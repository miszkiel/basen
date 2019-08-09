package interfejsy;

public class Calculator implements CanAdd, CanSubstract, CanMultiply, CanDivide {

    int a = 6;
    int b = 8;

    @Override
    public void add(){
        int suma = a+b;
        System.out.println("Wynik dodawania "+a+" i "+b+" wynosi "+suma);
    }

    @Override
    public void substract(){
        int diff = a-b;
        System.out.println("Wynik odejmowania "+a+" i "+b+" wynosi "+diff);
    }

    @Override
    public void multiply(){
        int iloczyn = a+b;
        System.out.println("Wynik mnożenia "+a+" i "+b+" wynosi "+iloczyn);
    }
    @Override
    public void divide(){
        float ilorazab = a/b;
        float ilorazba = b/a;
        System.out.println("Wynik dzielenia "+a+" przez "+b+" wynosi "+ilorazab+" a "+b+" przez "+a+" "+ilorazba);
    }
}
