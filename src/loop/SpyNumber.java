package loop;

import java.util.Scanner;

public class SpyNumber {
    public static void main(String[] args) {
        Scanner Sc=new Scanner(System.in);
        System.out.println("Enter a number");
        int num= Sc.nextInt();
        int digit,sum=0,prod=1;
        while (num>0)
        {
            digit=num%10;
            sum+=digit;
            prod*=digit;
            num/=10;
        }

        if (sum==prod)
            System.out.println("It is a spy number");
        else
            System.out.println("It is not a spy number");
    }
}
