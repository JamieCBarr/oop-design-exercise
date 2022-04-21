public class Rectangle extends Shape{
    protected double length;
    protected double width;

    public Rectangle(){
        super();
        this.length = this.width = 1;
    }

    public Rectangle(double length, double width){
        super();
        this.length = length;
        this.width = width;
    }

    public Rectangle(String color, boolean filled){
        super(color, filled);
        this.length = this.width = 1;
    }

    public Rectangle(String color, boolean filled, double length, double width){
        super(color, filled);
        this.length = length;
        this.width = width;
    }

    @Override
    double getArea() {return length * width;}
    @Override
    double getPerimeter() {return 2 * length + 2 * width;}
    double getDiagonal(){return Math.sqrt(length*length+width*width);}
    public double getLength() {return length;}
    public double getWidth() {return width;}
    public boolean isRectangle(){return (length > 0 && width > 0);}

    @Override
    public String toString(){
        return "A rectangle with width=" + width + " and length=" + length + ", which is a subclass of " + super.toString();
    }
}
