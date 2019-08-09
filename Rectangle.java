package figures;

import figures.EColor;
import figures.AbstractShape;

public class Rectangle extends AbstractShape {

    double a,b;

    public Rectangle(double a, double b, EColor color){
        super(color);
        this.a = a;
        this.b = b;
    }

    public double getA(){
        return a;
    }
    public void setA(double a){
        this.a =a;
    }

    public double getB(){
        return b;
    }
    public void setB(double b){
        this.b =b;
    }

    @Override
    public double getPerimeter(){
        return 2*(a+b);
    }

    @Override
    public double getSurface(){
        return a*b;
    }

    @Override
    public String toString(){
        return "Rectangle: a= "+a+", b= "+b+", color = "+color;
    }

    /*Rectangle: a= 2.0, b= 5.0, color = RED
perimeter= 14.0
surface= 10.0

Square: a= 6.0, color= YELLOW
perimeter= 24.0
surface= 36.0

Triangle: a= 3.0, b= 4.0, c= 5.0, color = ORANGE
perimeter= 12.0
surface= 7.745966692414834

Circle: radius = 3.0, color = BLUE
perimeter= 18.84955592153876
surface= 28.274333882308138
*/


}
