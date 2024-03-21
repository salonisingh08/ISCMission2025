package Method;

import java.util.Scanner;

public class SumOfDigit{
    int sum(int num)
    {
        int sum=0,digit;
        while (num!=0){
            digit=num%10;
            sum+=digit;
            num/=10;
        }
        return(sum);
    }

    public static void main(String[] args) {
        Scanner Sc=new Scanner(System.in);
        SumOfDigit obj=new SumOfDigit();
        System.out.println("Enter a numbber");
        int n= Sc.nextInt();
        int r=obj.sum(n);
        System.out.println(r);
    }
}
