package jdesign.builder;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Ivans on 9/24/2017.
 */
public class Meal {

    private List<Item> itemList = new ArrayList<>();

    public void addItem(Item item){
        itemList.add(item);
    }

    public float getCost(){
        float cost = 0.0f;
        for (Item item : itemList) {
            cost += item.price();
        }
        return cost;
    }

    public void showItems(){
        for (Item item : itemList) {
            System.out.println("item: " + item.name());
            System.out.println(", paking: " + item.packing());
            System.out.println(", price: " + item.price());
        }
    }

}
