import java.util.ArrayList;

/*Write program and add all group names in to array and iterates through for
each loop.*/
public class Q09 {
    public static void main(String[] args) {
        ArrayList<String> groupmembersname = new ArrayList<>();
        groupmembersname.add("Kinjal");
        groupmembersname.add("Nayan");
        groupmembersname.add("shikha");
        groupmembersname.add("Avani");
        groupmembersname.add("Ripti");
        for (String i : groupmembersname) {
            System.out.println(i);
        }

    }

}
