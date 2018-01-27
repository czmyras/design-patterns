package pl.czmyras.designpatterns.factory;

import pl.czmyras.designpatterns.domain.shapes.Circle;
import pl.czmyras.designpatterns.domain.shapes.Rectangle;
import pl.czmyras.designpatterns.domain.shapes.Shape;
import pl.czmyras.designpatterns.domain.shapes.Square;

public class ShapeFactory {

    //use getShape method to get object of type shape
    public Shape getShape(String shapeType){
        if(shapeType == null){
            return null;
        }
        if(shapeType.equalsIgnoreCase("CIRCLE")){
            return new Circle();

        } else if(shapeType.equalsIgnoreCase("RECTANGLE")){
            return new Rectangle();

        } else if(shapeType.equalsIgnoreCase("SQUARE")){
            return new Square();
        }

        return null;
    }
}