package jdesign.builder;

/**
 * Created by Ivans on 9/24/2017.
 */
public class Pepsi extends ColdDrink {
    @Override
    public String name() {
        return "Pepsi";
    }

    @Override
    public float price() {
        return 43.5f;
    }
}
