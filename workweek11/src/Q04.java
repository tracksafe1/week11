import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;

/*Write a Java program to iterate through all elements in an array list using
Iterator.*/
public class Q04 {
    public static void main(String[] args) {
        ArrayList<String> days = new ArrayList<>();
        days.add("monday");
        days.add("friday");
        days.add("saturday is a party day");
        days.add("Tuesday");
        days.add("Sunday ");
        // for(String day:days){
        //    System.out.println(day);
        //  Collections.sort(days);
        Iterator<String> days1 = days.iterator();

        while (days1.hasNext()) {
            System.out.println(days1.next());
        }
    }

}

