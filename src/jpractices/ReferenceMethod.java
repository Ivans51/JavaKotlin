package jpractices;

import java.util.ArrayList;
import java.util.List;

public class ReferenceMethod {

    public static void main(String[] args) {
        System.out.println("Hello");
        List<String> names = new ArrayList<>();
        names.add("Ivans");
        names.forEach(System.out::print);
        names.removeIf(s -> s.equalsIgnoreCase("Ivans"));
        names.sort(String::compareTo);

        names.stream().filter(s -> s.startsWith("I")).forEach(System.out::print);
        names.stream().map(String::toUpperCase).forEach(System.out::print);
    }
}
