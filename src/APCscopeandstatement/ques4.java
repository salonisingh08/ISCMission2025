package APCscopeandstatement;

import java.util.Scanner;

public class ques4 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a natural number (N > 0): ");
        int N = scanner.nextInt();

        if (N <= 0) {
            System.out.println("Invalid Number");
        } else {
            findCombinations(N, "");
        }

        scanner.close();
    }

    public static void findCombinations(int N, String currentCombination) {
        if (N == 0) {
            System.out.println(currentCombination.trim());
            return;
        }

        for (int i = 1; i <= N; i++) {
            findCombinations(N - i, currentCombination + i + " ");
        }
    }
}