package jdesign.abstractfactory;

/**
 * Created by Ivans on 9/24/2017.
 */
public class Blue implements Color{
    @Override
    public void fill() {
        System.out.println("Color blue");
    }

    @Override
    public void getMessage(String msn) {
        System.out.println(msn);
    }
}
