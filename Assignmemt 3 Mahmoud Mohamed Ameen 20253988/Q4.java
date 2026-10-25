import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter positive integers (enter 0 to finish): ");
        int number = scanner.nextInt();

        if (number == 0) {
            System.out.println("No numbers were entered.");
        } else {
            int max = number;
            int min = number;
            int sum = 0;
            int count = 0;

            while (number != 0) {
                if (number > max) {
                    max = number;
                }
                if (number < min) {
                    min = number;
                }
                sum += number;
                count++;

                number = scanner.nextInt();
            }

            double average = (double) sum / count;

            System.out.println("Largest number: " + max);
            System.out.println("Smallest number: " + min);
            System.out.println("Average: " + average);
        }

        scanner.close();
    }
}