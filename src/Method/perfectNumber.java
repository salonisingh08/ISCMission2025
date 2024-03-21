package Method;

import java.util.Scanner;

public class perfectNumber {
    int perfect(int num)
    {
        int i=1,sum=0;
        while (i<=num/2)
        {
            if (num%i==0)
                sum+=i;
            i++;
        }
        return(sum);
    }

    public static void main(String[] args) {
        Scanner Sc=new Scanner(System.in);
        perfectNumber obj=new  perfectNumber();
        System.out.println("Enter a number");
        int num= Sc.nextInt();
        int sum=0;
        obj.perfect(num);
        if (sum==num)
            System.out.println("It is a perfect number");
        else
            System.out.println("It is not a perfect number");
    }
}
