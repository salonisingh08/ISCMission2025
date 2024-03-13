package loop;

import java.util.Scanner;

public class StrontioNumber {
    public static void main(String[] args) {
        Scanner Sc=new Scanner(System.in);
        System.out.println("Enter a number");
        int num= Sc.nextInt();
        int n=num;
        num=(num*2%1000)/10;
        if (num%10==num/10)
            System.out.println(n+"= is a strontio number");
        else
            System.out.println(n+"= is not a strontio number");
    }
}
