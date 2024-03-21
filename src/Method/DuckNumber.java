package Method;

import java.util.Scanner;

public class DuckNumber {
    static int flag=0;
    int duck (int num)
    {
        int d=0,n=num;
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
        return (flag);
    }

    public static void main(String[] args) {
        Scanner Sc=new Scanner(System.in);
        DuckNumber obj=new DuckNumber();
        System.out.println("Enter a number");
        int num= Sc.nextInt();
        obj.duck(num);
        if (flag==0)
            System.out.println("It is not a duck number");
        else
            System.out.println("It is  a duck number");
    }
}
