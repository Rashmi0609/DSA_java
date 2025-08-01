import java.util.Scanner;

public class Product {
    public static int calculateProduct(int a, int b) {
        return a * b;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter first number: ");
        int a = sc.nextInt();
        System.out.print("Enter second number: ");
        int b = sc.nextInt();
        int product = calculateProduct(a, b);
        System.out.println("Product of " + a + " and " + b + " is: " + product);
        
        sc.close();

    }
}
