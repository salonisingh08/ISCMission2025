package APCscopeandstatement;


import java.util.Scanner;

public class ques16
{
    static boolean primeCheck(int num) {
        boolean isPrime = true;
        if (num <= 1)
            return false;

        for (int i = 2; i <= num / 2; i++) {
            if (num % i == 0) {
                isPrime = false;
                break;
            }
        }

        return isPrime;
    }

    static void printResult(int n, int p1, int p2) {
        System.out.println("Number read in is " + n + "\tp1 = "
                + p1 + ", p2 = "
                + p2);
    }

    public static void main(String args[]) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int n = in.nextInt();
        boolean res1 = primeCheck(n);
        if (res1) {
            boolean res2 = primeCheck(n - 2);
            if (res2) {
                printResult(n, n - 2, n);
                return;
            }

            boolean res3 = primeCheck(n + 2);
            if (res3) {
                printResult(n, n, n + 2);
                return;
            }
        }
        if (primeCheck(n - 1) && primeCheck(n + 1)) {
            printResult(n, n - 1, n + 1);
            return;
        }
        int l1 = 0, l2 = 0;
        for (int i = n - 1; i >= 5; i--) {
            if (primeCheck(i) && primeCheck(i - 2)) {
                l1 = i - 2;
                l2 = i;
                break;
            }
        }
        int r1 = 0, r2 = 0;
        for (int i = n + 1; i < Integer.MAX_VALUE - 2; i++) {
            if (primeCheck(i) && primeCheck(i + 2)) {
                r1 = i;
                r2 = i + 2;
                break;
            }
        }
        if (l1 != 0 && l2 != 0 && r1 != 0 && r2 != 0) {
            int lDist = Math.min(Math.abs(n - l1), Math.abs(n - l2));
            int rDist = Math.min(Math.abs(n - r1), Math.abs(n - r2));
            if (lDist < rDist)
                printResult(n, l1, l2);
            else
                printResult(n, r1, r2);
        }
        else if (l1 != 0 && l2 != 0) {
            printResult(n, l1, l2);
        }
        else if (r1 != 0 && r2 != 0) {
            printResult(n, r1, r2);
        }
    }
}