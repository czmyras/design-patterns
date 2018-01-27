package pl.czmyras.designpatterns.abstractfactory;

import pl.czmyras.designpatterns.domain.colors.Blue;
import pl.czmyras.designpatterns.domain.colors.Color;
import pl.czmyras.designpatterns.domain.colors.Green;
import pl.czmyras.designpatterns.domain.colors.Red;
import pl.czmyras.designpatterns.domain.shapes.Shape;

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
