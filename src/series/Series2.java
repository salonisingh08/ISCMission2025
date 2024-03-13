package series;


public class Series2 {
    public static void main(String[] args) {

        double s=0,s1=0,s2=0;
        for (int i = 10; i >1; i--) {
            int f=1;
            for (int j = 1; j <=i ; j++) {
                f*=j;
                s1+=(double)(f/i);
            }
        }
        for (int i = 1; i <=10 ; i++) {
            int f=1;
            for (int j = 1; j <=i ; j++) {
                f*=j;
                s2+=(double)+f;
            }
            s=s1-s2;
            System.out.println("The of the series="+s);
        }
    }
}
