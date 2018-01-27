package pl.czmyras.designpatterns.factory;

import pl.czmyras.designpatterns.domain.shapes.Shape;

public class Main {

    public void factoryPatternDemo() {
        ShapeFactory shapeFactory = new ShapeFactory();

        //get an object of Circle and call its draw method.
        Shape shape1 = shapeFactory.getShape("CIRCLE");

        //call draw method of Circle
        shape1.draw();

        //get an object of Rectangle and call its draw method.
        Shape shape2 = shapeFactory.getShape("RECTANGLE");

        //call draw method of Rectangle
        shape2.draw();

        //get an object of Square and call its draw method.
        Shape shape3 = shapeFactory.getShape("SQUARE");

        //call draw method of circle
        shape3.draw();
    }

    public static void main(String[] args) {
        Main app = new Main();
        app.factoryPatternDemo();
    }
}
