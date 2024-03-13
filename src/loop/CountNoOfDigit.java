package loop;

import java.util.*;

public class CountNoOfDigit {
    public static void main(String[] args) {
        Scanner Sc=new Scanner(System.in);
        System.out.println("Enter a number");
        int num= Sc.nextInt();
        int c=0,digit;

        while (num!=0){
            digit=num%10;
            c+=digit;
            num/=10;
        }
        System.out.println("Count no of digit="+c);
    }
}
