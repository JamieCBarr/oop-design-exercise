public class Square extends Rectangle{

    public Square() {
        super();
    }

    public Square(double side){
     super(side, side);
    }

    public Square(String color, boolean filled){
        super(color, filled);
    }

    public Square(String color, boolean filled, double  side){
        super(color, filled, side, side);
    }


    public boolean isSquare(){return ((super.isRectangle()) && (this.length == this.width));}

    @Override
    public String toString(){
        return "A Square with side=" + length + ", which is a subclass of " + super.toString();
    }
}
