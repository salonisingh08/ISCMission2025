package javastatement;

import java.util.Scanner;

public class SmallestNumber {
    public static void main(String[] args) {
        Scanner Sc=new Scanner(System.in);
        System.out.println("Enter three number");
        int a= Sc.nextInt();
        int b= Sc.nextInt();
        int c= Sc.nextInt();
        if (a<b&&a<c)
            System.out.println("Smallest Number="+a);
        else if (b<a&&b<c)
            System.out.println("Smallest Number="+b);
        else
            System.out.println("Smallest Number="+c);
    }
}
