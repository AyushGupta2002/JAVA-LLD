package org.example.FactoryPattern;

public class FactoryPatternMain {
    public static void main (String[] args) {
        ShapeFactory shapeFactory = new ShapeFactory();
        Shape circleShape = shapeFactory.getShape("CIRCLE");
        Shape rectangleShape = shapeFactory.getShape("RECTANGLE");
        circleShape.draw();
        rectangleShape.draw();
    }
}
