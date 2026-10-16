import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double unitPrice = scanner.nextDouble();
        int quantity = scanner.nextInt();
        final double TAX_RATE = 0.14;
        double subtotal = unitPrice * quantity;
        double tax = subtotal * TAX_RATE;
        double total = subtotal + tax;
        System.out.printf("Subtotal = %.2f, Tax = %.2f, Total = %.2f\n", subtotal, tax, total);
        scanner.close();
    }
}