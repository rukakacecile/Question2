//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Shape Circle= new Circle(5.0);

        Shape Rectangle=new Rectangle( 8.0 , 3.0);

        Shape Triangle= new Triangle(5.0 , 4.0);

        System.out.println("the area of the Circle " + Circle.calculateArea());
        System.out.println();
        System.out.println("the area of the Rectangle " + Rectangle.calculateArea());
        System.out.println();
        System.out.println("the area of the Triangle " + Triangle.calculateArea());

    }
}