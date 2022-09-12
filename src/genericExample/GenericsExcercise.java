package genericExample;

import java.util.ArrayList;

public class GenericsExcercise {

    public static void main(String[] args) {
        ArrayList<Object> variables = new ArrayList<Object>();

        Double dubNum = 2.2;
        Integer intNum = 3;
        String win = "Win!";
        Character c = 'c';

        variables.add(dubNum);
        variables.add(intNum);
        variables.add(win);
        variables.add(c);

        for(Object variable : variables) {
            displayClassName(variable);
        }
    }

    static <T> void displayClassName(T variable){
        System.out.println(variable.getClass().getName());
    }
}
