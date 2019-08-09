package interfejsy;

public class MainCalculator {
    public static void main(String[] args){

        CanAdd canAdd = new Calculator();
        canAdd.add();

        CanSubstract canSubstract = new Calculator();
        canSubstract.substract();

        CanMultiply canMultiply = new Calculator();
        canMultiply.multiply();

        CanDivide canDivide = new Calculator();
        canDivide.divide();
    }
}
