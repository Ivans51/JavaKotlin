package jdesign.abstractfactory;

/**
 * Created by Ivans on 9/24/2017.
 */
public class ColorFactory extends TypeAbstractFactory {
    @Override
    Color getColor(String color) {

        if (color == null)
            return null;
        else if (color.equalsIgnoreCase("Blue"))
            return new Blue();
        else if (color.equalsIgnoreCase("Red"))
            return new Red();
        return null;
    }

    @Override
    Shape getShape(String shape) {

        return null;
    }
}
