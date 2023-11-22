import java.util.HashMap;
import java.util.Scanner;

/*Write the program that tell you which line pass through particular stations.
Just use Zone 1 stations name. (Challenge)
picadilly circus-Picaddily line,*/
public class Q08 {
    public static void main(String[] args) {
        HashMap<String, String> trainstations = new HashMap<>();
        trainstations.put("MarbleArch", "Central line");
        trainstations.put("Oxfordcircus", "Bakerloo,Central,Victoria");
        trainstations.put("LondonBridge", "Jubilee,Northern");
        trainstations.put("King'sCross", "Piccadilly, Northern, Victoria");
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter Station Name :");
        String station = scanner.next();
        if (trainstations.containsKey(station)) {
            String lines = trainstations.get(station);
            System.out.println(station + " is in Zone 1 and is served by the following line(s): " + lines);
        } else {
            System.out.println(station + " is  not in Zone 1 ");

        }
    }
}