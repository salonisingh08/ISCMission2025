package loop;

import java.util.Scanner;

public class SumOfDigit {
    public static void main(String[] args) {
        Scanner Sc=new Scanner(System.in);
        System.out.println("Enter a numbber");
        int num= Sc.nextInt();
        int sum=0,digit;
        while (num!=0){
            digit=num%10;
            sum+=digit;
            num/=10;
        }
        System.out.println("Sum of digit="+sum);
    }
}
