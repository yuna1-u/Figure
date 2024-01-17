public class Figure {

    private double a;
    private double b;
    private double c;
    private double r;

    public void circleAreaAndPerimeter() {
        double area = 3.14 * (r * r);
        System.out.println("Area of a cricle: " + area);

        double perimeter = 2 * 3.14 * r;
        System.out.println("Cricle perimeter: " + perimeter + '\n');
    }

    public void rectangleAreaAndPerimeter() {
        double area = a * b;
        System.out.println("Area of a rectangle: " + area);

        double perimeter = 2 * (a + b);
        System.out.println("Rectangle perimeter: " + perimeter + '\n');

    }

    public void triangleAreaAndPerimeter() {
        double halfPerimetr = (a + b + c) / 2;
        double area = Math.sqrt(halfPerimetr * (halfPerimetr - a) * (halfPerimetr - b) * (halfPerimetr - c));
        System.out.println("Area of a triangle: " + area);

        double perimeter = a + b + c;
        System.out.println("Triangle perimeter: " + perimeter);

    }

    public void setA(double a) {
        this.a = a;
    }

    public void setB(double b) {
        this.b = b;
    }

    public void setC(double c) {
        this.c = c;
    }

    public void setR(double r) {
        this.r = r;
    }


}
