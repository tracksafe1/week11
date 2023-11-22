import java.util.ArrayList;

/*Write program and add all group members names in to array and iterates
through for each loop and print your name.*/
public class Q10 {
    public static void main(String[] args) {
        ArrayList<String> groupname = new ArrayList<>();
        groupname.add("Kinjal");
        groupname.add("Avani");
        groupname.add("Ripti");
        groupname.add("Shikha");
        groupname.add("Nayan");
        groupname.add("Khushbu");
        System.out.println("Groupmembers name :" + groupname);
        for (String name : groupname) {
            if (name.equalsIgnoreCase("Shikha")) {
                ;
                System.out.println("My Name : " + name);
            }
        }
    }
}
