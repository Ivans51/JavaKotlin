package jdesign.builder;

/**
 * Created by Ivans on 9/24/2017.
 */
public class Coke extends ColdDrink {
    @Override
    public String name() {
        return "Coke";
    }

    @Override
    public float price() {
        return 23.5f;
    }
}
