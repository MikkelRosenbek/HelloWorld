public class Circle {
    double radius;

    public Circle(double radius){
        this.radius = radius;
    }
    public double findArea() {
        return Math.PI * (radius * radius);
    }
}
