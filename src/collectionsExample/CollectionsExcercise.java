package collectionsExample;

import java.util.LinkedList;
import java.util.List;

public class CollectionsExcercise {

    public static void main(String[] args) {

        List<String> listOfItems = new LinkedList<String>();

        listOfItems.add("Chicken"); listOfItems.add("Rice"); listOfItems.add("Broccoli");

        for(String item : listOfItems) {
            System.out.println(item);
        }
    }
}
