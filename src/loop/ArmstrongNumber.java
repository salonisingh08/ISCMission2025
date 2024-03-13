package loop;

import java.util.*;

public class ArmstrongNumber {
    public static void main(String[] args) {
        Scanner Sc=new Scanner(System.in);
        System.out.println("Enter a number");
        int num= Sc.nextInt();
        int n=num,rem,arms=0;
        while (num>0)
        {
            rem=num%10;
            arms+=(int)Math.pow(rem,3);
            num/=10;
        }
        if (n==arms)
            System.out.println("It is a Armstrong number");
        else
            System.out.println("It is not a Armstrong number");
    }
}
