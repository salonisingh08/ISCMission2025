package Method;

import java.util.Scanner;

public class TechNumber {
    static int squareOfSum = 0;
    void tech (int num)
    {
        int n= num, firstHalf, secondHalf, digits = 0;
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
    }

    public static void main(String[] args) {
        Scanner Sc=new Scanner(System.in);
        TechNumber obj=new TechNumber();
        System.out.println("Enter a number");
        int num= Sc.nextInt();
        obj.tech(num);
    }
}
