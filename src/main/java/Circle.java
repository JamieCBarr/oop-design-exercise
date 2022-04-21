public class Circle  extends Shape{
    protected double radius;

    public Circle(){
        super();
        this.radius = 1;
    }

    public Circle(double radius){
        super();
        this.radius = radius;
    }

    public Circle(String color, boolean filled){
        super(color, filled);
        this.radius = 1;
    }

    public Circle(String color, boolean filled, double radius){
        super(color, filled);
        this.radius = radius;
    }

    @Override
    double getArea() {return Math.PI * radius *radius;}
    @Override
    double getPerimeter() {return getCircumference();}
    double getCircumference(){return 2 * Math.PI * radius;}

    public double getRadius() {return radius;}
    public boolean isCircle(){return (radius > 0);}

    @Override
    public String toString(){
        return "A Circle with radius=" + radius + ", which is a subclass of " + super.toString();
    }
}
