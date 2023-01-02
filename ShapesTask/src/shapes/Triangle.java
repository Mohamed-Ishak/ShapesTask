package shapes;

public class Triangle extends Shape{

    private double base ;
    private double height ;


    public Triangle() {
        System.out.println("Note that provided Base and height are in cm");
    }

    public double getBase() {
        return base;
    }

    public void setBase(double base) {
        this.base = base;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }



    //Suppose the Type of Triangle to be Equilateral
    @Override
    public void calcArea() {
        System.out.println("The Formula to find area of Triangle is (1/2 * Base * height)");
        area = 0.5 * getBase() * getHeight() ;
        System.out.println("The Area of Triangle =  : "+area);
    }

    @Override
    public void calcPerimeter() {
        System.out.println("The Formula to find perimeter of Triangle is (Side + Side + Side)");
        perimeter = getBase() * 3;
        System.out.println("The perimeter of Triangle =  : "+perimeter);
    }
}
