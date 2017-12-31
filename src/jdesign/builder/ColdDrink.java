package jdesign.builder;

/**
 * Created by Ivans on 9/24/2017.
 */
public abstract class ColdDrink implements Item{

    @Override
    public Packing packing() {
        return new Bottle();
    }

    public abstract float price();
}
