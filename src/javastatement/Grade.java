package javastatement;

import java.util.Scanner;

public class Grade {
    public static void main(String[] args) {
        Scanner Sc=new Scanner(System.in);
        System.out.println("Enter the mark");
        int m= Sc.nextInt();
        if (m>=90)
            System.out.println("Grade="+'A');
       else if (m>=70&&m<89)
            System.out.println("Grade="+'B');
        else if (m>=50&&m<69)
            System.out.println("Grade="+'C');
        else
            System.out.println("Grade="+'D');
    }
}
