package collectionsExample;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class SortingExample {

    public static void main(String[] args) {

        List<String> nanmes = Arrays.asList("Texas", "Minnesota", "Florida");

        Collections.sort(nanmes);

        for(String name : nanmes) {
            System.out.println(name);
        }
    }
}
