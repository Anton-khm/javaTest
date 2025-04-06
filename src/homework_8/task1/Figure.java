package homework_8.task1;

public class Figure {
    public static void main(String[] args) {
        Rectangle rectangle = new Rectangle(5, 5);
        rectangle.calculateArea();
        Triangle triangle = new Triangle(5, 10);
        triangle.calculateArea();
        Circle circle = new Circle(5);
        circle.calculateArea();
    }

    public int side;

    public Figure(){
    }

    public Figure(int side){
        this.side = side;
    }

    public void calculateArea(){
    }
}
