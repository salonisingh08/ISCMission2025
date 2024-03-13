package series;

import java.util.Scanner;

public class series1 {
    public static void main(String[] args) {
        Scanner Sc=new Scanner(System.in);
        System.out.println("Enter a value of n");
        int n= Sc.nextInt();
        int p=2,q=7;
        double sum=0;
        for (int i =1 ; i <=n ; i++) {
            if (i%2==0)
                sum-=(double)p/q;
            else
                sum+=(double)p/q;
            p+=3;
            q+=4;
        }
        System.out.println("Sum ofr series="+sum);
    }
}
