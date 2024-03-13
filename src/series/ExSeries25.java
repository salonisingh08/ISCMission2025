package series;
/*
    1*2/1+2+1*2*3/1+2+3+1*2*3*4/1+2+3+4.......1*2*3*4*........*10/1+2+3+4.......+10
 */
public class ExSeries25 {
    public static void main(String[] args) {
        double sum=0;
        for (int i = 1; i <= 10; i++) {
            int p = 1;
            for (int j = 1; j <= i; j++) {
                p *= j;
            }


            int term = 1;

            term += i;
            sum += p/term;
        }

        System.out.println("Sum of series =" + sum);
    }
}


