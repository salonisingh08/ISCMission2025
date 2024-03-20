package series;



public class ExSeries34 {
    public static void main(String[] args) {
        int n=5,a=5;
        int f=1;double sum=0;
        for (int i = 1; i <=n ; i++) {
            f+=2;
            f*=i;
        
            sum=Math.pow(a,i+3)/f;
        }
        System.out.println("Sum of series="+sum);
    }
}
