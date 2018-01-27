package pl.czmyras.designpatterns.domain.shapes;

public class Square implements Shape {
    @Override
    public void draw() {
        System.out.println("Inside Square::draw() method.");
    }
}
