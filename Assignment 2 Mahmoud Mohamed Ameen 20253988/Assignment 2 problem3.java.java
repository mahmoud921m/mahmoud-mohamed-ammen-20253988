import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double num1 = scanner.nextDouble();
        char operator = scanner.next().charAt(0);
        double num2 = scanner.nextDouble();
        double result = 0;
        boolean valid = true;

        switch (operator) {
            case '+':
                result = num1 + num2;
                break;
            case '-':
                result = num1 - num2;
                break;
            case '*':
                result = num1 * num2;
                break;
            case '/':
                result = num1 / num2;
                break;
            default:
                valid = false;
        }

        if (valid) {
            System.out.println("Result: " + result);
        }
        scanner.close();
    }
}