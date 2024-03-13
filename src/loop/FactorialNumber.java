package loop;

import java.util.Scanner;

public class FactorialNumber {
    public static void main(String[] args) {
        Scanner Sc=new Scanner(System.in);
        System.out.println("Enter a number");
        int num= Sc.nextInt();
        int f=1;
        for (int i = 1; i <=num; i++) {
            f*=i;
        }
        System.out.println("Factorial Number="+f);
    }
}
