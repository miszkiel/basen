package figures;

import figures.EColor;
import figures.Rectangle;

public class Square extends Rectangle{

    //Konstruktor przyjmuje długość boku i kolor
    public Square(double a, EColor color){
        // to jest odwołanie do klasy nadrzędnej czyli Rectangle, która przyjmuje 3 parametry
        super(a,a,color);

    }

    @Override
    public void setA(double a){
        setSide(a);
    }

    @Override
    public void setB(double b){
        setSide(b);
    }

    private void setSide(double side){
        super.setA(side);
        super.setB(side);

    }

    @Override
    public String toString(){
        return "Square: a= "+a+", color= "+color;
    }


// Nie musimy zmieniać metod liczenia pola i obwodu, są takie same dla kwadratu jak i dla prostokąta

}
