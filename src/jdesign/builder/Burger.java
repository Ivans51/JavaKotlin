package jdesign.builder;

/**
 * Created by Ivans on 9/24/2017.
 */
public abstract class Burger implements Item{

    @Override
    public Packing packing() {
        return new Wrapper();
    }

    public abstract float price();
}
