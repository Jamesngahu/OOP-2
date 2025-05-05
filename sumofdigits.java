import java.util.Scanner;
public class sumofdigits {

        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);

            System.out.print("Enter a positive integer: ");
            int number = scanner.nextInt();

            if (number < 0) {
                System.out.println("Invalid input. Please enter a positive integer.");
            } else {
                int sum = 0;

                while (number > 0) {
                    int digit = number % 10;
                    sum = sum + digit;
                    number = number / 10;
                }

                System.out.println("Sum of digits: " + sum);
            }

            scanner.close();
        }
    }


