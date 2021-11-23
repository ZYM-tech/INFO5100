public class ShapeMaker implements Shape{
    Shape Circle = new Circle();
    Shape Square = new Square();
    Shape Rectangle = new Rectangle();

    @Override
    public void draw() {
        drawCircle();
        drawRectangle();
        drawSquare();
    }

    public void drawCircle() {
        Circle.draw();
    }

    public void drawRectangle() {
        Rectangle.draw();
    }

    public void drawSquare() {
        Square.draw();
    }
}
