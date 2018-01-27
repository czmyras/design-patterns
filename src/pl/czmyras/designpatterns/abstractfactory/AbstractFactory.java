package pl.czmyras.designpatterns.abstractfactory;

import pl.czmyras.designpatterns.domain.colors.Color;
import pl.czmyras.designpatterns.domain.shapes.Shape;

public abstract class AbstractFactory {
    abstract Color getColor(String color);
    abstract Shape getShape(String shapeType) ;
}
