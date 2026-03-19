package FactoryPattern;

public class Main {
    public static void main(String[] args) {
        ShapeFactory shapeFactory=new ShapeFactory();
        Shape circle=shapeFactory.shapeFactoryObject("Circle");
        circle.draw();
    }
}
