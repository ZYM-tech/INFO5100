public class ShapeTester {
    public static void main(String[] args){
        HW2_Q1.Shape shape1 = new HW2_Q1.Shape("Shape1", "pink");
        System.out.println("shape1");
        System.out.println(shape1.printShape());

        HW2_Q1.Shape shape2 = new HW2_Q1.Shape("Shape2", "orange", 20, 30);
        System.out.println("shape2");
        System.out.println("area : " + shape2.getArea() + " perimeter : " + shape2.getPerimeter()); System.out.println(shape2.printShape());

        HW2_Q1.Rectangle rectangle1 = new HW2_Q1.Rectangle(2);
        System.out.println("rectangle1");
        System.out.println("area : " + rectangle1.getArea() + " perimeter : " + rectangle1.getPerimeter());

        HW2_Q1.Rectangle rectangle2 = new HW2_Q1.Rectangle("Rectangle", "Purple",4, 7); System.out.println("rectangle2");
        System.out.println("area : " + rectangle2.getArea() + " perimeter : " + rectangle2.getPerimeter()); System.out.println(rectangle2.printShape());

        HW2_Q1.Square square1 = new HW2_Q1.Square(3);
        System.out.println("square1");
        System.out.println("area : " + square1.getArea() + " perimeter : " + square1.getPerimeter());

        HW2_Q1.Square square2 = new HW2_Q1.Square("Square" , "black", 7);
        System.out.println("square2");
        System.out.println("area : " + square2.getArea() + " perimeter : " + square2.getPerimeter()); System.out.println(square2.printShape());
    }
}
