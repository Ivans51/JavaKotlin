package jdesign.singlenton;

/**
 * Created by Ivans on 9/24/2017.
 */
public class SingleObject {

    private static SingleObject instance = new SingleObject();

    private SingleObject() {
    }

   public static SingleObject getInstance(){
        return instance;
   }

   public void showMessage(){
       System.out.println("Hello Ivans");
   }
}
