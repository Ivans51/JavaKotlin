package jdesign.prototype;

/**
 * Created by Ivans on 9/24/2017.
 */
public class Square extends Shape {

    public Square() {
        type = "Square";
    }

    @Override
    void drawn() {
        System.out.println("Inside Square");
    }
}
