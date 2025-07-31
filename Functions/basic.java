import java.util.*;

public class basic {

    public static int calculateSum(int num1, int num2) {
        int sum = num1 + num2;
        return sum;

    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter first number: ");
        int a = sc.nextInt();

        System.out.print("Enter second number: ");
        int b = sc.nextInt();

        int sum = calculateSum(a, b);
        System.out.println("The sum is: " + sum);

        sc.close();
    }

}