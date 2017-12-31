package jdesign.abstractfactory;

/**
 * Created by Ivans on 9/24/2017.
 */
public abstract class TypeAbstractFactory {
    abstract Color getColor(String color);
    abstract Shape getShape(String shape);
}
