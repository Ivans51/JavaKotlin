package jdesign.abstractfactory;

/**
 * Created by Ivans on 9/24/2017.
 */
public class Red implements Color{
    @Override
    public void fill() {
        System.out.println("Color red");
    }

    @Override
    public void getMessage(String msn) {
        System.out.println(msn);
    }
}
