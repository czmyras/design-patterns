package pl.czmyras.designpatterns.abstractfactory;

import pl.czmyras.designpatterns.domain.colors.Color;
import pl.czmyras.designpatterns.domain.shapes.Circle;
import pl.czmyras.designpatterns.domain.shapes.Rectangle;
import pl.czmyras.designpatterns.domain.shapes.Shape;
import pl.czmyras.designpatterns.domain.shapes.Square;

public class ShapeFactory extends AbstractFactory {
    @Override
    Color getColor(String color) {
        return null;
    }

    @Override
    Shape getShape(String shapeType) {
        if(shapeType == null){
            return null;
        }

        if(shapeType.equalsIgnoreCase("CIRCLE")){
            return new Circle();

        }else if(shapeType.equalsIgnoreCase("RECTANGLE")){
            return new Rectangle();

        }else if(shapeType.equalsIgnoreCase("SQUARE")){
            return new Square();
        }

        return null;

    }
}
