package javastatement;

import java.util.Scanner;

public class Triangle {
    public static void main(String[] args) {
        Scanner Sc=new Scanner(System.in);
        System.out.println("Enter three angle");
        int a= Sc.nextInt();
        int b= Sc.nextInt();
        int c= Sc.nextInt();
        int sum=a+b+c;
        
        if (sum==180)
        {
            if (a==b&&b==c&&c==a)
                System.out.println("Equilateral Triangle");
            else if (a==b||b==c||c==a)
                System.out.println("Isosceles Triangle");
            else
                System.out.println("Scalene Triangle");
        }
        else
            System.out.println("It is not forming triangle");
    }
}
