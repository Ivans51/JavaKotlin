package jdesign.abstractfactory;

/**
 * Created by Ivans on 9/24/2017.
 */
public class FactoryChoiceProducer {

    public static TypeAbstractFactory getFactory(String choice){

        if (choice.equalsIgnoreCase("Shape"))
            return new ShapeFactory();
        else if (choice.equalsIgnoreCase("Color"))
            return new ColorFactory();
        return null;
    }

}
