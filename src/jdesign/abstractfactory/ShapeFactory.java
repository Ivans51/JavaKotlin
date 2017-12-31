package jdesign.abstractfactory;

/**
 * Created by Ivans on 9/24/2017.
 */
public class ShapeFactory extends TypeAbstractFactory {
    @Override
    Color getColor(String color) {

        return null;
    }

    @Override
    Shape getShape(String shape) {

        if (shape == null)
            return null;
        else if (shape.equalsIgnoreCase("Circle"))
            return new Circle();
        else if (shape.equalsIgnoreCase("Square"))
            return new Square();
        return null;
    }
}
