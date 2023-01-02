package shapes;

public class Circle extends Shape{


    //Attributes
    final double  pi = 3.14;  // constant
    private double radius ;


    // Methods

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    //default Constructor
    public Circle() {
        System.out.println("Note that provided radius is in cm");
    }



    @Override
    public void calcArea() {

        System.out.println("The Formula to find area of Circle is (π r^2)");
        area = pi * Math.pow(getRadius(),2);
        System.out.println("The Area of Circle =  : "+area);
    }

    @Override
    public void calcPerimeter() {

        System.out.println("The Formula to find perimeter of Circle is (2 π r)");
        perimeter = 2 * pi * getRadius();
        System.out.println("The Perimeter of Circle = : "+perimeter);

    }
}
