import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int totalDays = scanner.nextInt();
        int weeks = totalDays / 7;
        int remainingDays = totalDays % 7;
        System.out.println(weeks + " weeks and " + remainingDays + " days");
        scanner.close();
    }
}