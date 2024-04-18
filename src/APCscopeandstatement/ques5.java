package APCscopeandstatement;

import java.util.Scanner;

public class ques5 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a natural number (100 < N < 1000, no zeros): ");
        int number = scanner.nextInt();

        if (number <= 100 || number >= 1000) {
            System.out.println("Invalid Number (out of range)");
        } else {
            int hundredsDigit = number / 100;
            int tensDigit = (number / 10) % 10;
            int unitsDigit = number % 10;
            if (hundredsDigit == 0 || tensDigit == 0 || unitsDigit == 0) {
                System.out.println("Invalid Number (contains zero)");
            } else {
                printCombination(hundredsDigit, tensDigit, unitsDigit);
                printCombination(tensDigit, hundredsDigit, unitsDigit);
                printCombination(tensDigit, unitsDigit, hundredsDigit);
                printCombination(unitsDigit, tensDigit, hundredsDigit);
                printCombination(unitsDigit, hundredsDigit, tensDigit);
                printCombination(hundredsDigit, unitsDigit, tensDigit);
            }
        }
    }

    public static void printCombination(int digit1, int digit2, int digit3) {
        System.out.println(digit1 * 100 + digit2 * 10 + digit3);
    }
}