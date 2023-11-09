package shapes;

public class ShapesTest {

    public static void main(String[] args) {

        Measurable myShape = new Square(5);
        System.out.println(myShape.getArea());
        System.out.println(myShape.getPerimeter());

        Measurable myShape1 = new Rectangle(5, 4);
        System.out.println(myShape1.getArea());
        System.out.println(myShape1.getPerimeter());

    }



}
