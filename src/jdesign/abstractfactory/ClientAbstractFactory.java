package jdesign.abstractfactory;

/**
 * Created by Ivans on 9/24/2017.
 */
public class ClientAbstractFactory{

    public static void main(String[] args) {

        TypeAbstractFactory abstractFactory = FactoryChoiceProducer.getFactory("Shape");
        Shape circle = abstractFactory.getShape("Circle");
        circle.drawn();

        TypeAbstractFactory abstractFactory1 = FactoryChoiceProducer.getFactory("Color");
        Color red = abstractFactory1.getColor("Red");
        red.fill();
        red.getMessage("Hola");

        TypeAbstractFactory abstractFactory2 = FactoryChoiceProducer.getFactory("Color");
        Shape blue = abstractFactory2.getShape("Blue");
        blue.drawn();
    }
}
