package jdesign.bridge;

/**
 * Created by Ivans on 9/27/2017.
 */
public class RedCircle implements DrawAPI {
    @Override
    public void draw(int radius, int x, int y) {
        System.out.println("Circle Red: " + radius + x + y);
    }
}
