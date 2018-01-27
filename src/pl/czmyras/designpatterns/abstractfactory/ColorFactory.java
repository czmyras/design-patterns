package pl.czmyras.designpatterns.abstractfactory;

import pl.czmyras.designpatterns.colors.Blue;
import pl.czmyras.designpatterns.colors.Color;
import pl.czmyras.designpatterns.colors.Green;
import pl.czmyras.designpatterns.colors.Red;
import pl.czmyras.designpatterns.shapes.Shape;
import pl.czmyras.designpatterns.shapes.ShapeType;

public class ColorFactory extends AbstractFactory {
    @Override
    Color getColor(String color) {
        if(color == null){
            return null;
        }

        if(color.equalsIgnoreCase("RED")){
            return new Red();

        }else if(color.equalsIgnoreCase("GREEN")){
            return new Green();

        }else if(color.equalsIgnoreCase("BLUE")){
            return new Blue();
        }
        return null;
    }

    @Override
    Shape getShape(String shapeType) {
        return null;
    }
}
