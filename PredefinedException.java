import java.util.Scanner;

public class PredefinedException {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter your age: ");
        String input = sc.nextLine();

        try {
            int age = Integer.parseInt(input);

            System.out.println("Age entered: " + age);

            // Demonstrating ArithmeticException
            int result = 100 / age;
            System.out.println("100 divided by age = " + result);

        } catch (NumberFormatException e) {
            System.out.println("NumberFormatException: Please enter a valid number.");

        } catch (ArithmeticException e) {
            System.out.println("ArithmeticException: Age cannot be zero.");
        }

        sc.close();
    }
}