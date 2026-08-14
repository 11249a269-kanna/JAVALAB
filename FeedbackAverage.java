import java.util.Scanner;

public class FeedbackAverage {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int[] ratings = new int[5];
        int sum = 0;
        double average;

        System.out.println("Enter 5 feedback ratings:");

        for (int i = 0; i < 5; i++) {
            System.out.print("Rating " + (i + 1) + ": ");
            ratings[i] = sc.nextInt();
            sum = sum + ratings[i];
        }

        average = (double) sum / 5;

        System.out.println("\nAverage Rating: " + average);

        sc.close();
    }
}