package javastatement;

import java.util.Scanner;

public class Check {
    public static void main(String[] args) {
        Scanner Sc=new Scanner(System.in);
        System.out.println("Enter a choice");
        int i= Sc.nextInt();
        System.out.println("Enter a number");
        int num= Sc.nextInt();
        if (num<0)
            i=1;
        else if (num>0)
            i=2;
        else
            i=3;
        switch (i)
        {
            case 1:
                System.out.println("Negative number");
                break;
            case 2:
                System.out.println("Positive number");
                break;
            case 3:
                System.out.println("Zero");
                break;

            default:
                System.out.println("wrong choice");
        }
    }
}
