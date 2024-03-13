package javastatement;

import java.util.Scanner;

public class GreaterNo {
    public static void main(String[] args) {
        Scanner Sc=new Scanner(System.in);
        System.out.println("Enter three number");
        int a= Sc.nextInt();
        int b= Sc.nextInt();
        int c= Sc.nextInt();
        if (a>b)
        {
            if (a>c)
                System.out.println("Greater Number="+a);
            else
                System.out.println("Greater Number="+c);
        }
        else
        {
            if (b>c)
                System.out.println("Greater Number="+b);
            else
                System.out.println("Greater Number="+c);
        }
    }
}
