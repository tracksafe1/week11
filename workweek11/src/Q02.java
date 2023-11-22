import java.util.Scanner;

/*Re write the student mark sheet program using if else and while loop.*/
public class Q02 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter student name");
        String name = scanner.next();

        System.out.println("Enter english marks");
        int englishMarks = scanner.nextInt();

        System.out.println("Enter maths marks");
        int mathsmarks = scanner.nextInt();

        System.out.println("Enter computer marks");
        int computermarks = scanner.nextInt();

        // Check if marks are valid
        while (englishMarks < 0 || englishMarks > 100 || mathsmarks < 0 || mathsmarks > 100 || computermarks < 0 || computermarks > 100) {
            System.out.println("Invalid input. Marks should be between 0 and 100. Please enter again.");

            System.out.println("Enter english marks");
            englishMarks = scanner.nextInt();

            System.out.println("Enter maths marks");
            mathsmarks = scanner.nextInt();

            System.out.println("Enter computer marks");
            computermarks = scanner.nextInt();
        }


        {
            double Total = englishMarks + mathsmarks + computermarks;
            System.out.println("Total Marks : " + Total);

            double Average = Total / 3;
            System.out.println("Average : " + Average);

            char Grade;

            if (Average >= 90) {
                Grade = 'A';
            } else if (Average >= 80 && Average < 90) {
                Grade = 'B';
            } else if (Average >= 70 && Average < 80) {
                Grade = 'C';
            } else if (Average >= 55 && Average < 70) {
                Grade = 'D';
            } else if (Average >= 35 && Average < 55) {
                Grade = 'E';
            } else {
                Grade = 'F'; // You might want to assign a grade for failing
            }

            System.out.println("Grade: " + Grade);
        }
    }
}


