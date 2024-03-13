package javastatement;

import java.util.*;

public class Mean {
    public static void main(String[] args) {
        Scanner Sc=new Scanner(System.in);
        System.out.println("Enter your choice");
        System.out.println("Enter 1 for Arithmetic mean");
        System.out.println("Enter 2 for Geometric mean");
        System.out.println("Enter 3 for Harmonic mean");
        int c= Sc.nextInt();
        System.out.println("Enter two number");
        int a= Sc.nextInt();
        int b= Sc.nextInt();
        double mean=0.0;
        switch (c)
        {
            case 1:
                mean=(a+b)*2.0;
                System.out.println("Arithmetic mean="+mean);
                break;

            case 2:
                mean=Math.sqrt(a*b);
                System.out.println("Geometric mean="+mean);
                break;

            case 3:
                mean=2.0*a*b/(a+b);
                System.out.println("Harmonic mean="+mean);
                break;

            default:
                System.out.println("wrong choice");
        }
    }
}
