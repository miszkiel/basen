package inheritance;

import figures.*;

public class PolymorphismExample {

    public static void main(String[] args){

        //najpierw jest tworzony obiekt na stercie typu np. Rectangle, a następnie zmienna na stosie typu AbstractShape,
        // która wskazuje na ten obiekt. Takiej zmiennej można przypisać dowolną subklasę klasy AbstractShape.
        // W tym momencie mamy w pamięci cztery figury, ale w programie widziane są wszystkie jako typ AbstractShape.

        AbstractShape shape1 = new Rectangle(2,4,EColor.RED);
        AbstractShape shape2 = new Square(6,EColor.YELLOW);
        AbstractShape shape3 = new Triangle(3,4,5, EColor.ORANGE);
        AbstractShape shape4 = new Circle(3,EColor.BLUE);

        AbstractShape[] shapes = {shape1,shape2,shape3,shape4};

        // Tu w pętli po wszystkich shapes wypisujemy informacje, co unika powtórzeń, które były zastosowane wcześniej
        for (AbstractShape shape : shapes){
            System.out.println(shape);
            System.out.println("perimeter= "+shape.getPerimeter());
            System.out.println("surface="+shape.getSurface());
            System.out.println();
        }

        //A tu zmiana obiektu Rectangle na Circle
        shape1 = new Circle(10, EColor.YELLOW);
        System.out.println(shape1);

    }




}




