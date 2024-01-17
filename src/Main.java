public class Main {
    public static void main(String[] args) {


        Circle circle = new Circle();
        circle.setR(8);
        circle.circleAreaAndPerimeter();

        Rectangle rectangle = new Rectangle();
        rectangle.setA(5);
        rectangle.setB(4);
        rectangle.rectangleAreaAndPerimeter();

        Triangle triangle = new Triangle();
        triangle.setA(3);
        triangle.setB(5);
        triangle.setC(4);
        triangle.triangleAreaAndPerimeter();


    }
}