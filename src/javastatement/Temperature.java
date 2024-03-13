package javastatement;

import java.util.Scanner;

public class Temperature {
    public static void main(String[] args) {
        Scanner Sc=new Scanner(System.in);
        System.out.println("Enter a choice");
        int c= Sc.nextInt();
        System.out.println("Enter 1 for fahrenheit to celcius,2 for celcius to fahrenheit");
        System.out.println("Enter a temperature");
        double temp= Sc.nextDouble();
        switch (c)
        {
            case 1:
                temp=((9/5*temp)+32);
                System.out.println("covert fahrenheit to celcius="+temp);
                break;

            case 2:
                temp=(5/9*temp)-32;
                System.out.println("covert fahrenheit to  celcius= "+temp);
                break;

            default:
                System.out.println("Wrong choice");
        }
    }
}
