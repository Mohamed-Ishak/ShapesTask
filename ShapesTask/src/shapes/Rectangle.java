package shapes;

public class Rectangle extends Shape{

    private double length ;
    private double width ;


    public double getLength() {
        return length;
    }

    public void setLength(double length) {
        this.length = length;
    }

    public double getWidth() {
        return width;
    }

    public void setWidth(double width) {
        this.width = width;
    }

    //default Constructor
    public Rectangle() {
        System.out.println("Note that provided length and width are in cm");
    }



    @Override
    public void calcArea() {
        System.out.println("The Formula to find area of Rectangle is (length * width)");
        area = getLength() * getWidth() ;
        System.out.println("The Area of Rectangle =  : "+area);
    }

    @Override
    public void calcPerimeter() {
        System.out.println("The Formula to find area of Rectangle is 2 * (length + width) ");
        perimeter = 2 * (getLength() + getWidth()) ;
        System.out.println("The Area of Rectangle =  : "+perimeter);
    }
}
