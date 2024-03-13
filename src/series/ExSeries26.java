package series;

import java.util.Scanner;

/*
    a2/2-a2/4+a2/6-.......to n term
 */
public class ExSeries26 {
    public static void main(String[] args) {
        Scanner Sc=new Scanner(System.in);
        System.out.println("Enter the a value of a");
        int a= Sc.nextInt();
        System.out.println("Enter the a value of n");
        int n= Sc.nextInt();
        double sum=0.0;
        for (int i = 2; i <=n ; i++) {
            if (i%2!=0)
                sum+=(double) Math.pow(a,i*2)/i*2;
            else
                sum-=(double) Math.pow(a,i*2)/i*2;
        }
        System.out.println("Sim of  series="+sum);
    }
}
