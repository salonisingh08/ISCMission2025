package APCscopeandstatement;

import java.util.*;
public class Ques1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the number of days for payment (within 60): ");
        int days = scanner.nextInt();
        System.out.print("Enter customer type (D for Dealer, R for Retailer): ");
        char customerType = scanner.next().charAt(0);
        System.out.print("Enter the purchase amount: ");
        double purchaseAmount = scanner.nextDouble();
        double discount = calculateDiscount(customerType, days);
        double finalAmount = purchaseAmount - discount;
        System.out.println("\nBill Details:");
        System.out.println("Customer Type: " + (customerType == 'D' ? "Dealer" : "Retailer"));
        System.out.println("Purchase Amount: ₹" + purchaseAmount);
        System.out.println("Discount: ₹" + discount);
        System.out.println("Final Amount: ₹" + finalAmount);
    }

    public static double calculateDiscount(char customerType, int days) {
        double discount = 0;

        double purchaseAmount=0;
        if (customerType == 'D') {
            if (days <= 30) {
                discount = purchaseAmount * 0.12;
            } else if (days <= 45) {
                discount = purchaseAmount * 0.1;
            } else if (days <= 60) {
                discount = purchaseAmount * 0.08;
            }
        } else if (customerType == 'R') {
            if (days <= 30) {
                discount = purchaseAmount * 0.15;
            } else if (days <= 45) {
                discount = purchaseAmount * 0.1;
            } else if (days <= 60) {
                discount = purchaseAmount * 0.05;
            }
        } else {
            System.out.println("Invalid customer type!");
        }

        return discount;
    }
}
