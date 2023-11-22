import java.util.ArrayList;

/*Write a Java program to test an array list is empty or not. Define array list with
underground tube names*/
public class Q05 {
    public static void main(String[] args) {
        ArrayList<String> stationNames = new ArrayList<>();
        stationNames.add("waterloo");
        stationNames.add("picadilly circus");
        stationNames.add("Borehamwood");
        stationNames.add("Harrow");
        if (stationNames.isEmpty()) {
            System.out.println("Arraylist is empty");
        } else {
            for (String i : stationNames) {
                System.out.println(i);
            }


        }

    }
}
