import java.util.Scanner;

public class factorial {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.print("Enter a non-negative integer: ");
        int n = scan.nextInt();

        if (n < 0) {
            System.out.println("Factorial is not defined for negative numbers.");
        } else {
            long result = 1;
            for (int i = 1; i <= n; i++) {
                result *= i;
            }

            System.out.println("Factorial of " + n + " is " + result);
        }

        scan.close();
    }
}
