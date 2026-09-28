import java.util.Scanner;

/*
 * ScannerExample
 *
 * Scanner is a Java class used to take input from the user.
 *
 * Scanner belongs to the java.util package.
 *
 * We use:
 *     import java.util.Scanner;
 *
 * to make the Scanner class available in our program.
 */

public class ScannerExample {

    public static void main(String[] args) {

        /*
         * Creating a Scanner object
         *
         * Scanner -> Class
         * scanner -> Object/reference variable
         * new Scanner() -> Creates a new Scanner object
         * System.in -> Reads input from the keyboard
         *
         * In simple words:
         * This Scanner will read whatever the user types.
         */

        Scanner scanner = new Scanner(System.in);

        // =====================================================
        // STRING INPUT
        // =====================================================

        /*
         * nextLine()
         *
         * Reads the complete line of text.
         * It can read spaces.
         *
         * Example:
         * Input -> Manas Kasaudhan
         * Output -> Manas Kasaudhan
         */

        System.out.print("Enter your full name: ");
        String name = scanner.nextLine();

        // =====================================================
        // INTEGER INPUT
        // =====================================================

        /*
         * nextInt()
         *
         * Used to read integer values.
         *
         * Example:
         * Input -> 22
         */

        System.out.print("Enter your age: ");
        int age = scanner.nextInt();

        // =====================================================
        // DOUBLE INPUT
        // =====================================================

        /*
         * nextDouble()
         *
         * Used to read decimal values.
         *
         * Example:
         * Input -> 8.06
         */

        System.out.print("Enter your GPA: ");
        double gpa = scanner.nextDouble();

        // =====================================================
        // BOOLEAN INPUT
        // =====================================================

        /*
         * nextBoolean()
         *
         * Used to read either:
         *
         * true
         * false
         *
         * Example:
         * Input -> true
         */

        System.out.print("Are you a student? (true/false): ");
        boolean isStudent = scanner.nextBoolean();

        // =====================================================
        // CALCULATING PERFORMANCE
        // =====================================================

        String performance;

        if (gpa >= 9.0) {
            performance = "Excellent";
        } else if (gpa >= 8.0) {
            performance = "Very Good";
        } else if (gpa >= 7.0) {
            performance = "Good";
        } else if (gpa >= 6.0) {
            performance = "Average";
        } else {
            performance = "Needs Improvement";
        }

        // =====================================================
        // DISPLAY RESULT
        // =====================================================

        System.out.println();
        System.out.println("==========================================");
        System.out.println("           STUDENT INFORMATION");
        System.out.println("==========================================");

        System.out.println("Name        : " + name);
        System.out.println("Age         : " + age);

        /*
         * %.2f means:
         * Display the double value with 2 digits
         * after the decimal point.
         */

        System.out.printf("GPA         : %.2f%n", gpa);

        System.out.println("Student     : " + isStudent);
        System.out.println("Performance : " + performance);

        // Display student status

        if (isStudent) {
            System.out.println("Status      : Currently studying 🎓");
        } else {
            System.out.println("Status      : Not currently studying");
        }

        System.out.println("==========================================");

        // =====================================================
        // CLOSE SCANNER
        // =====================================================

        /*
         * close()
         *
         * Closes the Scanner and releases its resources.
         */

        scanner.close();
    }
}