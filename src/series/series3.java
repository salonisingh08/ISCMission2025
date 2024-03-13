package series;

import java.util.Scanner;

public class series3 {
    public static void main(String[] args) {
        Scanner Sc=new Scanner(System.in);
        System.out.println("Enter the value n");
        int n= Sc.nextInt();
        System.out.println("Enter the value a");
        int a= Sc.nextInt();
       double sum=0;
        for (int i = 1; i <=n ; i++) {
            int f=1;
            for (int j = 1; j <=i ; j++) {
                f*=j;
                if (i%2==0)
                    sum-=(double)(Math.pow(a,i))/f;
                else
                    sum+=(double)(Math.pow(a,i))/f;
            }
        }
        System.out.println("Sum of series="+sum);
    }
}
