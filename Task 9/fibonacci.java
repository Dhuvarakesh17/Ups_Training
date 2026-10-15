import java.util.Scanner;

public class fibonacci {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.print("Enter the number of terms: ");
        int n = scan.nextInt();

        if (n <= 0) {
            System.out.println("Please enter a positive number.");
        } else {
            long first = 0;
            long second = 1;

            System.out.print("Fibonacci series: ");
            for (int i = 1; i <= n; i++) {
                System.out.print(first);
                if (i < n) {
                    System.out.print(" ");
                }

                long next = first + second;
                first = second;
                second = next;
            }
            System.out.println();
        }

        scan.close();
    }
}
