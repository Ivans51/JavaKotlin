package jdesign.factory;

/**
 * Created by Ivans on 9/24/2017.
 */
public class ShapeFactory {

    public Shape getShape(String shapeType){
        if (shapeType == null) {
            return null;
        } else if (shapeType.equalsIgnoreCase("Rentangle")) {
            return new Rectangle();
        } else if (shapeType.equalsIgnoreCase("Square")) {
            return new Square();
        }
        return null;
    }

}
