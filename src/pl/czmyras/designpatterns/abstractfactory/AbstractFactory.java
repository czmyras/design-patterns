package pl.czmyras.designpatterns.abstractfactory;

import pl.czmyras.designpatterns.colors.Color;
import pl.czmyras.designpatterns.shapes.Shape;
import pl.czmyras.designpatterns.shapes.ShapeType;

public abstract class AbstractFactory {
    abstract Color getColor(String color);
    abstract Shape getShape(String shapeType) ;
}
