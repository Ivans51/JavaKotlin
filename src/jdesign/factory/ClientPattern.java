package jdesign.factory;

/**
 * Created by Ivans on 9/24/2017.
 */
public class ClientPattern {

    public static void main(String[] args) {
        ShapeFactory shapeFactory = new ShapeFactory();
        Shape shape1 = shapeFactory.getShape("Rentangle");
        shape1.drawn();

        Shape shape2 = shapeFactory.getShape("square");
        shape2.drawn();

    }

}
