package loop;

import java.util.Scanner;

public class DuckNumber {
    public static void main(String[] args) {
        Scanner Sc=new Scanner(System.in);
        System.out.println("Enter a number");
        int num= Sc.nextInt();
        int d=0,flag=0,n=num;
        while (num>0)
        {
            d=num%10;
            if (d==0)
            {
                flag++;
                break;
            }
            num=num/10;
        }
        if (flag==0)
            System.out.println("It is not a duck number");
        else
            System.out.println("It is  a duck number");
    }
}
