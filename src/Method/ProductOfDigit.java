package Method;

import java.util.Scanner;

public class ProductOfDigit {
    int product(int num) {
        int prod = 1, digit;
        while (num != 0) {
            digit = num % 10;
            prod *= digit;
            num /= 10;
        }
        return (prod);
    }

    public static void main(String[] args) {
            Scanner Sc=new Scanner(System.in);
        ProductOfDigit obj=new  ProductOfDigit();
            System.out.println("Enter a numbber");
            int n= Sc.nextInt();
            int r=obj.product(n);
        System.out.println(r);
    }
}

