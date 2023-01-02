package shapes;

public class Main {

    public static void main(String[] args) {


        Circle circle = new Circle();

        circle.setRadius(5.6);
        circle.calcArea();
        circle.calcPerimeter();
        System.out.println("");
        System.out.println("==============================");


        Rectangle rectangle = new Rectangle();

        rectangle.setLength(4.2);
        rectangle.setWidth(5.8);
        rectangle.calcArea();
        rectangle.calcPerimeter();
        System.out.println("");
        System.out.println("==============================");


        Square square = new Square();

        square.setSide(3);
        square.calcArea();
        square.calcPerimeter();
        System.out.println("");
        System.out.println("==============================");


        Triangle triangle= new Triangle();

        triangle.setBase(3.5);
        triangle.setHeight(3.9);
        triangle.calcArea();
        triangle.calcPerimeter();

    }
}
