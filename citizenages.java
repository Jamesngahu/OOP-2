import java.util.*;
public class citizenages {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter your age (0 - 100): ");
        int age = scanner.nextInt();

        if (age < 0 || age > 100) {
            System.out.println("Invalid age. Please enter an age between 0 and 100.");
        } else if (age <= 18) {
            System.out.println("Category: Child");
        } else if (age <= 25) {
            System.out.println("Category: Youth");
        } else if (age <= 50) {
            System.out.println("Category: Adult");
        } else {
            System.out.println("Category: Senior Citizen");
        }

        scanner.close();
    }
}
