public interface Shape {
    void calculateArea();

    void calculatePerimeter();
}
class Circle implements Shape {
    @Override
    public void calculateArea() {
        System.out.println("The area of the circle is 5.13589 m2.");
    }

    @Override
    public void calculatePerimeter() {
        System.out.println("The perimeter for circle is 2.8 cm.");
    }
}

class Square implements Shape {
    @Override
    public void calculateArea() {
        System.out.println("The area of the square is 10x10 in.");
    }

    @Override
    public void calculatePerimeter() {
        System.out.println("The perimeter for square is 40 in.");
    }
}

class ShapeTester{
    public static void main(String[] args) {

        Circle c=new Circle();
        c.calculateArea();
        c.calculatePerimeter();

        Square s=new Square();
        s.calculateArea();
        s.calculatePerimeter();

    }
}
