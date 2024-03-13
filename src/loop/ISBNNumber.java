package loop;

import java.util.Scanner;

public class ISBNNumber {
    public static void main(String[] args) {
        Scanner Sc=new Scanner(System.in);
        System.out.println("Enter a number");
        int num= Sc.nextInt();
        int s=0,rev=0,d,x=1,c=0,t=num;
        while (t>0)
        {
            c++;
            t=t/10;
        }
        if (c!=10)
        {
            System.out.println("Illegal ISBN");

        }
        else
        {
            while (num>0)
            {
                d=num%10;
                rev=rev*10+d;
                num/=10;
            }
            while (rev>0)
            {
                d=rev%10;
                s=s+x+d;
                x++;
                rev/=10;
            }
            if (s%11==0)
                System.out.println("legal ISBN");
            else
                System.out.println("Illegal ISBN");
        }
    }
}
