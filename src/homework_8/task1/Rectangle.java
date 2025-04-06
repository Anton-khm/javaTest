package homework_8.task1;

public class Rectangle extends Triangle {
    public Rectangle(int side, int height){
        super(side, height);
    }

    public Rectangle(){};

    public void calculateArea(){
        super.calculateArea();
        System.out.println("Area of rectangle is: " + (side * height));
    }
}
