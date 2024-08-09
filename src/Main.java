public class Main {
    public static void main(String[] args) {
        AbstractShape circle = new Circle(5);
        System.out.println("circle area:"+circle.getArea());
        System.out.println("circle perimeter:"+circle.getPerimeter());
        AbstractShape rectangle = new Rectangle(4,7);
        System.out.println("Rectangle area:"+rectangle.getArea());
        System.out.println("Rectangle perimeter:"+rectangle.getPerimeter());
        AbstractShape triangle = new Triangle(3,4,5);
        System.out.println("Triangle Area:"+triangle.getArea());
        System.out.println("Triangle perimeter:"+triangle.getPerimeter());
    }
}
