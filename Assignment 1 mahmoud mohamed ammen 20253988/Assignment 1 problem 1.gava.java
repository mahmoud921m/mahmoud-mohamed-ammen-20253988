import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        double radius = scanner.nextDouble();
        
        double area = Math.PI * Math.pow(radius, 2);
        double circumference = 2 * Math.PI * radius;
        
        System.out.printf("%.2f\n", area);
        System.out.printf("%.2f\n", circumference);
        
        scanner.close();
    }
}