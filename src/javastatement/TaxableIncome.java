package javastatement;

import java.util.Scanner;

public class TaxableIncome {
    public static void main(String[] args) {
        Scanner Sc=new Scanner(System.in);
        System.out.println("Enter age,gender,taxable income");
        int age= Sc.nextInt();
        String g= Sc.nextLine();
        double TI= Sc.nextDouble();
        double tax= Sc.nextInt();
        if (age>65&&g=="Female")
            System.out.println("Wrong category");
        else
        {
            if (TI<160000)
               tax=0;
            else if (TI>160000&&TI<=500000)
                tax=((TI-160000)*(10/100));
            else if (TI>500000&&TI<=800000)
                tax=((TI*500000)*(20/100)+34000);
            else
                tax=((TI-800000)*(30/100)+44000);
        }
        System.out.println("Income tax payable="+tax);
    }
}
