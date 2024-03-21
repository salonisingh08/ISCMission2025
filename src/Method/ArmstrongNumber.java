package Method;

import java.util.Scanner;

public class ArmstrongNumber {

   void  arms (int num){
        int n1=num,rem,arms=0;
        while (num>0)
        {
            rem=num%10;
            arms+=(int)Math.pow(rem,3);
            num/=10;
        }
    }

    public static void main(String[] args) {
        Scanner Sc=new Scanner(System.in);
        ArmstrongNumber obj=new ArmstrongNumber();
        System.out.println("Enter a number");
        int num= Sc.nextInt();
        int n1=num,arms=0;
       obj.arms(num);
        if (n1==arms)
            System.out.println("It is a Armstrong number");
        else
            System.out.println("It is not a Armstrong number");
    }
}
