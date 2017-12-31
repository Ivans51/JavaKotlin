package jdesign.builder;

/**
 * Created by Ivans on 9/24/2017.
 */
public class ClientBuilder {

    public static void main(String[] args) {
        MealBuilder mealBuilder = new MealBuilder();
        Meal vegMeal = mealBuilder.prepareVegMeal();
        vegMeal.showItems();
        System.out.println("Total: " + vegMeal.getCost());

        Meal nonVegMeal = mealBuilder.prepareNonVegetal();
        nonVegMeal.showItems();
        System.out.println("Total: " + nonVegMeal.getCost());
    }
}
