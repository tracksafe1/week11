import java.util.ArrayList;
import java.util.Collections;

/*Write a Java program to create a new array list, add some colours(string) and
printout the collection using for each loop.*/
public class Q03 {
    public static void main(String[] args) {
        ArrayList<String> colours = new ArrayList<>();
        colours.add("Red");
        colours.add("blue");
        colours.add("Indigo");
        colours.add("Cyan");
        colours.add("Pink");
        colours.add("Orange");


        System.out.println(colours);

        for (String colour : colours) {

            System.out.println(colour);

        }


    }
}
