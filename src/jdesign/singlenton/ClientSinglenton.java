package jdesign.singlenton;

/**
 * Created by Ivans on 9/24/2017.
 */
public class ClientSinglenton {

    public static void main(String[] args) {
        SingleObject singleObject = SingleObject.getInstance();
        singleObject.showMessage();
    }
}
