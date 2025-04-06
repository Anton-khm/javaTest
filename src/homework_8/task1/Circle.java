package homework_8.task1;

public class Circle extends Rectangle {
    public int radius;

    public Circle(int radius){
        this.radius = radius;
    }

    @Override
    public void calculateArea() {
        super.calculateArea();
        System.out.println("Area of a cicrcle: " + (Math.PI * Math.pow(radius, 2)));
    }
}
