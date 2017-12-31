package jdesign.builder;

/**
 * Created by Ivans on 9/24/2017.
 */
public class MealBuilder {

    public Meal prepareVegMeal(){
        Meal meal = new Meal();
        meal.addItem(new VegBurger());
        meal.addItem(new Coke());
        return meal;
    }

    public Meal prepareNonVegetal(){
        Meal meal = new Meal();
        meal.addItem(new ChickBurger());
        meal.addItem(new Pepsi());
        return meal;
    }

}
