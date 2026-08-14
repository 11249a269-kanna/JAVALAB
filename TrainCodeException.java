import java.util.Scanner;

public class TrainCodeException {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String[] trainCodes = {"TR101", "TR202", "TR303", "TR404", "TR505"};

        System.out.print("Enter train code index (0-4): ");
        int index = sc.nextInt();

        try {
            System.out.println("Train Code: " + trainCodes[index]);
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Exception: Invalid array index!");
            System.out.println("Please enter an index between 0 and 4.");
        }

        sc.close();
    }
}