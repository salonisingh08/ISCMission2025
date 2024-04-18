package APCscopeandstatement;

import java.util.Scanner;

public class ques3 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int choice;
        do {
            System.out.println("\nMenu:");
            System.out.println("1. Find Prime Fibonacci Numbers (upto 1000)");
            System.out.println("2. Find Prime Factors of a Number");
            System.out.println("3. Exit");
            System.out.print("Enter your choice: ");
            choice = scanner.nextInt();

            switch (choice) {
                case 1:
                    findPrimeFibonacci();
                    break;
                case 2:
                    findPrimeFactors(scanner);
                    break;
                case 3:
                    System.out.println("Exiting program.");
                    break;
                default:
                    System.out.println("Invalid choice!");
            }
        } while (choice != 3);
    }

    public static void findPrimeFibonacci() {
        for (int i = 0; i <= 1000; i++) {
            if (isFibonacci(i) && isPrime(i)) {
                System.out.print(i + " ");
            }
        }
        System.out.println("\n");
    }

    public static boolean isFibonacci(int n) {
        double phi = (1 + Math.sqrt(5)) / 2;
        return Math.abs((Math.pow(phi, n) - Math.pow(-phi, -n)) / Math.sqrt(5)) - n < 1e-6;
    }

    public static boolean isPrime(int num) {
        if (num <= 1) {
            return false;
        }
        if (num <= 3) {
            return true;
        }
        if (num % 2 == 0 || num % 3 == 0) {
            return false;
        }
        for (int i = 5; i * i <= num; i += 6) {
            if (num % i == 0 || num % (i + 2) == 0) {
                return false;
            }
        }
        return true;
    }

    public static void findPrimeFactors(Scanner scanner) {
        System.out.print("Enter a number: ");
        int num = scanner.nextInt();

        System.out.print("The prime factors of " + num + " are: ");
        for (int i = 2; i <= num; i++) {
            if (isPrime(i) && num % i == 0) {
                while (num % i == 0) {
                    System.out.print(i + " ");
                    num /= i;
                }
            }
        }
        System.out.println("\n");
    }
}