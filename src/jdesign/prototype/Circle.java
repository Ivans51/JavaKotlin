package jdesign.prototype;

/**
 * Created by Ivans on 9/24/2017.
 */
public class Circle extends Shape {

    public Circle() {
        type = "Circle";
    }

    @Override
    void drawn() {
        System.out.println("Inside Circle");
    }
}
