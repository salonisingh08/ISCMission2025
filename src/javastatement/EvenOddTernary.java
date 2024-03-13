package javastatement;

import java.util.Scanner;

public class EvenOddTernary {
    public static void main(String[] args) {
        Scanner Sc=new Scanner(System.in);
        System.out.println("Enter a number");
        int num= Sc.nextInt();
        String msg =  (num % 2 == 0) ? "The number is even" : "The number is odd";
        System.out.println(msg);
    }
}
