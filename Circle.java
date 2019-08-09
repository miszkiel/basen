package figures;

import figures.EColor;
import figures.AbstractShape;

public class Circle extends AbstractShape{

    private double radius;

    //konstruktor; w pierwszej linii musi być wywołany konstruktor klasy bazowej gdyż ma on parametr (color);
    // jakby go nie miał to można by go pominąć
    // super <-- konstruktor klasy nadrzędnej (superklasy)

    public Circle(double radius, EColor color){
        super(color);
        this.radius=radius;
    }

    //getRadius()

    public double getRadius(){
        return radius;
    }

    public void setRadius(double radius){
        this.radius = radius;
    }

    //getDiameter()

    public double getDiameter(){
        return 2*radius;
    }

    //implementacja abstrakcyjnej metody getPerimeter()

    @Override
    public double getPerimeter(){
        return 2*Math.PI*radius;
    }

    //implementacja abstrakcyjnej metody getSurface()

    @Override
    public double getSurface(){
        return Math.PI*radius*radius;
    }

    //nadpisanie toStringa

    @Override
    public String toString(){
        return "Circle: radius = "+radius+", color = "+color;
    }

}
