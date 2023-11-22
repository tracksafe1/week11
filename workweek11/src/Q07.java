import java.util.HashMap;

/*Create a HashMap object called people that will store String keys and Integer
values: And use for each loop to iterate the value from Map.*/
public class Q07 {
    public static void main(String[] args) {
        HashMap<String, Integer> birthdate = new HashMap<>();
        birthdate.put("shikha", 8);
        birthdate.put("Mona", 16);
        birthdate.put("shreay", 2);
        birthdate.put("Rennee", 1);
        for (String i : birthdate.keySet()) {
            System.out.println("key: " + i + " value: " + birthdate.get(i));
        }


    }
}
