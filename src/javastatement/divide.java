package javastatement;

import java.util.Scanner;

public class divide {
    public static void main(String[] args) {
        Scanner Sc=new Scanner(System.in);
        System.out.println("Enter two number");
        int a= Sc.nextInt();
        int b= Sc.nextInt();
        int c=0;
        if (a==0||b==0)
            System.out.println("Invalid entry");
        else
        {
            if (a>b)
                c=a/b;
            else
                c=b/a;
        }
        System.out.println("Quotient="+c);
    }
}
