package Pattern;

public class ReverseTrianglepattern1 {
    public static void main(String[] args) {
        int c=9,s=0;
        for (int i = 1; i <=5 ; i++) {
            for (int j = 1; j <=s ; j++) {
                System.out.print(" ");
            }
            for (int j = 1; j <=c ; j++) {
                System.out.print("* ");
            }
            c-=2;
            s++;
            System.out.println();
        }
    }
}
