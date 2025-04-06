package homework_8.task1;

public class Triangle extends Figure {
    public int height;

    public Triangle(int side, int height){
        super(side);
        this.height = height;
    }

    public Triangle(){}

    public void calculateArea() {
        super.calculateArea();
        System.out.println("The area of a triangle is " + (this.height * this.side)/2);
    }
}
