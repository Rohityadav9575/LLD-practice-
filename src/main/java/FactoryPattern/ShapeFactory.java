package FactoryPattern;

public class ShapeFactory {
    // it has the Shape so has a relationship
    // and based on the conditions we will get the obj from this class
    public Shape shapeFactoryObject(String objType){

        switch (objType){

            case "Circle": return new Circle();
            case "Rectangle": new Rectangle();
            case "Square": new Square();

        }
        return new Circle();
    }
}
