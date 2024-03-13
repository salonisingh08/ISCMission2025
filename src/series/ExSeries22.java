package series;

/*
    1/4-1/9+1/16-1/25+........+1/n
 */
import java.util.Scanner;

public class ExSeries22 {
    public static void main(String[] args) {
        Scanner Sb=new Scanner(System.in);
        System.out.println("Enter a value n");
        int n= Sb.nextInt();
        double sum=0;
        for (int i = 1; i <=n ; i++) {
            if (i%2!=0)
                sum+=(double) 1/Math.pow(i,2);
            else
                sum-=(double) 1/Math.pow(i,2);
        }
        System.out.println("Sum of series="+sum);
    }
}
