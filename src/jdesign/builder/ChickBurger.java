package jdesign.builder;

/**
 * Created by Ivans on 9/24/2017.
 * Create concrete classes extending Burger and ColdDrink classes
 */
public class ChickBurger extends Burger{
    @Override
    public String name() {
        return "Chicken burger";
    }

    @Override
    public float price() {
        return 50.5f;
    }
}
