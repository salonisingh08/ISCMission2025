package series;

import java.util.Scanner;

public class ExSeries1 {
    public static void main(String[] args) {
        Scanner Sc=new Scanner(System.in);
        System.out.println("Enter a value of n");
        int n= Sc.nextInt();
        int sum=0;
        for (int i = 1; i <=n ; i++) {
            if (i%2!=0)
                sum+=(int) Math.pow(i,2);
            else
                sum-=(int) Math.pow(i,3);
        }
        System.err.println("Sum of series="+sum);
    }
}
