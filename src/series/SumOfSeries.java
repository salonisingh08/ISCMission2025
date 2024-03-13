package series;

import java.util.*;
public class SumOfSeries {
    public static void main(String args[]) {
    Scanner in = new Scanner(System.in);
    System.out.print("Enter a: ");
    int a = in.nextInt();
    double sum = 0.0;
    for (int i = 1; i <= 10; i++)
        sum += Math.pow(a, 2) / i;
    System.out.println("Sum = " + sum);
    }

}
