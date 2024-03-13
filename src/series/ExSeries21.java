package series;

/*
    1/2-1/4+1/6-1/8+.......1/n
 */
import java.util.Scanner;

public class ExSeries21 {
    public static void main(String[] args) {
        Scanner Sc= new Scanner(System.in);
        System.err.println("Enter a value");
        int n= Sc.nextInt();
        double sum=0;
        for (int i = 2; i <=n ; i++) {
            if (i%2!=0)
                sum+=(double) 1/i*2;
            else
                sum-=(double) 1/i*2;
        }
        System.out.println("Sum of series="+sum);
    }
}
