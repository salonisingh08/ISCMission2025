package loop;

import java.util.Scanner;

public class PrimeNumber {
    public static void main(String[] args) {
        Scanner Sc=new Scanner(System.in);
        System.out.println("Enter a number");
        int num= Sc.nextInt();
        int c=0;
        for (int i = 2; i <=num ; i++) {
            if (num%i==0)
                c++;
        }
        if (c==1)
            System.out.println("It is a prime number");
        else
            System.out.println("It is not a prime number");
    }
}
