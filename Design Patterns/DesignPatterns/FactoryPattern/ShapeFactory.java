package DesignPatterns.FactoryPattern;

public class ShapeFactory {
    public Shape getShape(ShapeType shapeType) {
        if (shapeType == null) {
            return null;
        }
        if (shapeType == ShapeType.CIRCLE) {
            return new Circle();
        } else if (shapeType == ShapeType.SQUARE) {
            return new Square();
        }
        return null;
    }
}
