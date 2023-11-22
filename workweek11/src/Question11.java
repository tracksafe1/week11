import java.util.ArrayList;

/*11. Declare global variables of your name, Add all your group names in list, using
for each loop iterate and print ONLY your name.*/
public class Question11 {
    static String name = "shikha";

    public static void main(String[] args) {
        ArrayList<String> groupName = new ArrayList<>();
        groupName.add("Selenium");
        groupName.add("Agile");
        groupName.add("Code");
        groupName.add("Code1");
        groupName.add("Restassured");
        groupName.add("Java");
        groupName.add(name);
        for (String i : groupName) {
            if (i.equalsIgnoreCase("Shikha")) {
                System.out.println(i);
            }

        }
    }
}
