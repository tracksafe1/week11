import java.util.HashMap;
import java.util.HashSet;

/*Use a HashSet that stores Integer Objects. Store the number 4, 7 and 8 to Sets.
Show which numbers are between 1 and 10 are in the set. (Hint: use for loop
and if else)*/
public class Q06 {
    public static void main(String[] args) {
        HashSet<Integer> numbers = new HashSet<>();
        numbers.add(4);
        numbers.add(7);
        numbers.add(8);
        for (int i = 0; i <= 10; i++) {
            if (numbers.contains(i)) {
                System.out.println(i + "no is in list");
            } else {
                System.out.println(i + "no is not in list");
            }

        }
    }
}
