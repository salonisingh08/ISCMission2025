package Method;

import java.util.Scanner;

public class CountNoOfDigit {
    int count(int num)
    {
        int c=0,digit;

        while (num!=0){
            digit=num%10;
            c+=digit;
            num/=10;
        }
        return (c);
    }

    public static void main(String[] args) {
        Scanner Sc=new Scanner(System.in);
        CountNoOfDigit obj=new  CountNoOfDigit();
        System.out.println("Enter a number");
        int n= Sc.nextInt();
        int r=obj.count(n);
        System.out.println(r);
    }
}
