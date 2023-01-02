package shapes;

public class Square extends Shape{

    private double side ;

    public double getSide() {
        return side;
    }

    public void setSide(double side) {
        this.side = side;
    }

    public Square() {
        System.out.println("Note that provided side are in cm");
    }


    @Override
    public void calcArea() {
        System.out.println("The Formula to find area of Square is (Side * Side)");
        area = Math.pow(getSide(),2);
        System.out.println("The Area of Square =  : "+area +" cm2");
    }

    @Override
    public void calcPerimeter() {
        System.out.println("The Formula to find perimeter of Square is (Side * 4)");
        perimeter = getSide() * 4 ;
        System.out.println("The perimeter of Square =  : "+perimeter);
    }
}
