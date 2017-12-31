package jdesign.bridge;

/**
 * Created by Ivans on 9/27/2017.
 */
public class Circle extends Shape{

    private int x, y, radius;

    public Circle(int x, int y, int radius, DrawAPI drawAPI) {
        super(drawAPI);
        this.x = x;
        this.y = y;
        this.radius = radius;
    }

    @Override
    public void draw() {
        drawAPI.draw(radius, x, y);
    }
}
