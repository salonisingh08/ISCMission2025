package loop;

import java.util.Scanner;

public class PalindromeNumber {
    public static void main(String[] args) {
        Scanner Sc=new Scanner(System.in);
        System.out.println("Enter a number");
        int num= Sc.nextInt();
        int n=num,rem,pali=0;
        while (num>0)
        {
            rem=num%10;
            pali=(pali*10)+rem;
            num/=10;
        }
        if (n==pali)
            System.out.println("It is a palindrome  number");
        else
            System.out.println("It is not a palindrome number");
    }
}
