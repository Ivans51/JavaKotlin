package jdesign.builder;

/**
 * Created by Ivans on 9/24/2017.
 * Create concrete classes extending Burger and ColdDrink classes
 */
public class VegBurger extends Burger{
    @Override
    public String name() {
        return "Veg burger";
    }

    @Override
    public float price() {
        return 25.0f;
    }
}
