package DesignPatterns.FactoryPattern;

public class FactoryPatternDemo {
    public static void main(String[] args) {
        ShapeFactory shapeFactory = new ShapeFactory();

        Shape shape1 = shapeFactory.getShape(ShapeType.CIRCLE);
        shape1.draw();  // Output: Drawing a Circle

        Shape shape2 = shapeFactory.getShape(ShapeType.SQUARE);
        shape2.draw();  // Output: Drawing a Rectangle
    }
}
