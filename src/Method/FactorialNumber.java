package Method;

import java.util.Scanner;

public class FactorialNumber {
    int fact (int num){
        int f=1;
        for (int i = 1; i <=num; i++) {
            f*=i;
        }
        return (f);
    }

    public static void main(String[] args) {
        Scanner Sc=new Scanner(System.in);
        FactorialNumber obj=new FactorialNumber();
        System.out.println("Enter a number");
        int n= Sc.nextInt();
        int r=obj.fact(n);
        System.out.println(r);
    }
}
