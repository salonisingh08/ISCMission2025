package Method;

import java.util.Scanner;

public class PrimeNumber {
    int prime (int num)
    {
        int c=0;
        for (int i = 2; i <=num ; i++) {
            if (num%i==0)
                c++;
        }
        return(c);
    }

    public static void main(String[] args) {
        Scanner Sc=new Scanner(System.in);
        PrimeNumber obj=new PrimeNumber();
        System.out.println("Enter a number");
        int num= Sc.nextInt();
        int c=0;
        obj.prime(num);
        if (c==1)
            System.out.println("It is a prime number");
        else
            System.out.println("It is not a prime number");
    }
}
