package series;

import java.util.Scanner;

public class series {
    public static void main(String[] args) {
        Scanner Sc=new Scanner(System.in);
        System.out.println("Enter a value of n");
        int n= Sc.nextInt();
        double sum=0;
        for (int i =1 ; i <=n ; i++) {
            sum += 1 / i;
            System.out.println("sum of series=" + sum);
        }
    }
}
