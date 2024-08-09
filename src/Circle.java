public class Circle extends AbstractShape {
    double radius;
    public Circle(double radius)
    {
        this.radius = radius;
    }
    @Override
    double getArea()
    {
        return Math.PI*radius*radius;
    }
    @Override
    double getPerimeter()
    {
        return 2*Math.PI*radius;
    }

}
