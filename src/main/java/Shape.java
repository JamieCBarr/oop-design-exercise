public abstract class Shape {
    protected String color;
    protected boolean filled;

    public Shape(){
        this.color = "green";
        this.filled = true;
    }

    public Shape (String color, boolean filled){
        this.color = color;
        this.filled = filled;
    }

    abstract double getArea();
    abstract double getPerimeter();

    public String getColor() {return color;}
    public boolean isFilled() {return filled;}

    @Override
    public String toString(){
        return "A Shape with color of " + color + " and " + (!filled ? "Not " : "") + "Filled";
    }
}
