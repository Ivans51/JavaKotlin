package jdesign.bridge;

/**
 * Created by Ivans on 9/27/2017.
 */
public class BridgeDesign {

    public static void main(String[] args) {
        Shape redCircle = new Circle(100, 10, 10, new RedCircle());
        Shape greenCircle = new Circle(100, 10, 10, new GreenCircle());

        redCircle.draw();
        greenCircle.draw();
    }

}
