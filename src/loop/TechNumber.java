package loop;

import java.util.*;
class  TechNumber{
    public static void main(String[] args) {
        Scanner Sc=new Scanner(System.in);
        System.out.println("Enter a number");
        int num= Sc.nextInt();
        int n= num, firstHalf, secondHalf, digits = 0, squareOfSum = 0;
        while (num>0){
            num/=10;
            digits++;
        }
        if (digits%2==0)
        {
            firstHalf=num%(int)Math.pow(10,digits/2);
            secondHalf=num/(int)Math.pow(10,digits/2);
            squareOfSum=(firstHalf+secondHalf)*(firstHalf+secondHalf);
        }
        if (n==squareOfSum)
            System.out.println(n+"= is a tech number");
        else
            System.out.println(n+"= is not a tech number");
    }
}
