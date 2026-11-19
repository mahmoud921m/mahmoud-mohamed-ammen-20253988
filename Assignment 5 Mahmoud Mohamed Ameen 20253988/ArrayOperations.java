import java.util.Scanner;

public class ArrayOperations {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int[] nums = new int[6];
        int sumEven = 0;
        int countGreater = 0;

        System.out.print("Enter 6 numbers: ");

        for (int i = 0; i < 6; i++) {
            nums[i] = in.nextInt();
        }

        System.out.print("Reverse: ");
        for (int i = 5; i >= 0; i--) {
            System.out.print(nums[i] + " ");
        }
        System.out.println();

        for (int i = 0; i < 6; i++) {
            if (nums[i] % 2 == 0) {
                sumEven += nums[i];
            }

            if (nums[i] > nums[0]) {
                countGreater++;
            }
        }

        System.out.println("Sum of even numbers: " + sumEven);
        System.out.println("Greater than the first number: " + countGreater);

        in.close();
    }
}