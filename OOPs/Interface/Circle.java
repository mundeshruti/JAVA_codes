package OOPs.Interface;

public class Circle implements Shape {
    private double radius;

    public Circle(double radius) {
        this.radius = radius;
    }

    @Override
    public double area() {
        return Math.PI * radius * radius;
    }

    @Override
    public void display() {
        System.out.println("This is a circle.");
    }

    public static void main(String[] args) {
        Circle c1 = new Circle(5);
        c1.display(); // Output: This
        c1.area(); // Output: 78.

    }
}
