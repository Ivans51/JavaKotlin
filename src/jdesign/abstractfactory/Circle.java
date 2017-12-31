package jdesign.abstractfactory;

/**
 * Created by Ivans on 9/24/2017.
 */
public class Circle implements Shape{
    @Override
    public void drawn() {
        System.out.println("Shape circle");
    }

    public void getMessage(String msn){
        System.out.println(msn);
    }
}
