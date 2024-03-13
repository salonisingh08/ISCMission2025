package series;

public class print1 {
    public static void main(String[] args) {
        for (int i = 0; i <=10 ; i++) {
            int term = 1 + ((i * (i + 1)) / 2);
            System.out.print(term + " ");
        }
    }
}
