abstract class Shape {
    abstract void draw();
}
class Circle extends Shape {
    void draw() {
        System.out.println("Drawing a circle");
    }
}
class Rectangle extends Shape {
    void draw() {
        System.out.println("Drawing a rectangle");
    }
}
public class Abstract {
    public static void main(String[] args) {
        Shape shape1 = new Circle();
        Shape shape2 = new Rectangle();
        shape1.draw();
        shape2.draw();
    }
}
