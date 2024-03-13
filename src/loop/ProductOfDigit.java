package loop;

import java.util.Scanner;

public class ProductOfDigit {
    public static void main(String[] args) {
        Scanner Sc=new Scanner(System.in);
        System.out.println("Enter a numbber");
        int num= Sc.nextInt();
        int prod=1,digit;
        while (num!=0){
            digit=num%10;
            prod*=digit;
            num/=10;
        }
        System.out.println("Product of digit="+prod);
    }
}
