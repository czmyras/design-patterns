package pl.czmyras.designpatterns.singleton;

import pl.czmyras.designpatterns.domain.shapes.Shape;
import pl.czmyras.designpatterns.factory.ShapeFactory;

public class Main {

    public void singletonPatternDemo () {
        //illegal construct
        //Compile Time Error: The constructor SingleObject() is not visible
//        SingleObject object = new SingleObject();

        //Get the only object available
        SingleObject object = SingleObject.getInstance();

        //show the message
        object.showMessage();
    }

    public static void main(String[] args) {
        Main app = new Main();
        app.singletonPatternDemo();
    }
}
