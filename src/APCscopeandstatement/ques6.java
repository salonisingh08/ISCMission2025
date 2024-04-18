package APCscopeandstatement;

import java.util.Scanner;

public class ques6{

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the upper limit (n): ");
        int n = scanner.nextInt();

        if (n < 3) {
            System.out.println("Triangular numbers start from 3.");
        } else {
            System.out.println("Triangular Numbers from 3 to " + n + ":");
            for (int i = 3; i <= n; i++) {
                int triangularNumber = calculateTriangularNumber(i);
                System.out.println(triangularNumber);
            }
        }
    }

    public static int calculateTriangularNumber(int n) {
        return n * (n + 1) / 2;
    }
}