package Method;

import java.util.Scanner;

public class StrontioNumber {
    void stron(int num)
    {
        int n=num;
        num=(num*2%1000)/10;
        if (num%10==num/10)
            System.out.println(n+"= is a strontio number");
        else
            System.out.println(n+"= is not a strontio number");
    }

    public static void main(String[] args) {
        Scanner Sc=new Scanner(System.in);
        StrontioNumber obj=new  StrontioNumber();
        System.out.println("Enter a number");
        int num= Sc.nextInt();
        obj.stron(num);
    }
}
