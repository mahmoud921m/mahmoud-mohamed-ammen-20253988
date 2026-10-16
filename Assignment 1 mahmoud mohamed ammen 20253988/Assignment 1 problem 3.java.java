import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int score1 = scanner.nextInt();
        int score2 = scanner.nextInt();
        int score3 = scanner.nextInt();
        double average = (score1 + score2 + score3) / 3.0;
        int roundedAverage = (int) Math.round(average);
        System.out.println(roundedAverage);
        System.out.printf("%.2f\n", average);
        scanner.close();
    }
}