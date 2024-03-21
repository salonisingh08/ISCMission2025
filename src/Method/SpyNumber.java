package Method;

import java.util.Scanner;

public class SpyNumber {
   static int sum=0,prod=1;
    void spy(int num)
    {
        int digit;
        while(num != 0)
        {

            digit= num % 10;

            sum = sum +  digit;

            prod = prod * digit;

            num = num / 10;
        }
    }

    public static void main(String[] args) {
        Scanner Sc=new Scanner(System.in);
        SpyNumber obj=new  SpyNumber();
        System.out.println("Enter a number");
        int num= Sc.nextInt();

        obj.spy(num);
        if (sum==prod)
            System.out.println("It is a spy number");
        else
            System.out.println("It is not a spy number");
    }
}
