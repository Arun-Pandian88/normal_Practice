import java.util.Scanner;
public class FibonaciNumber {
    public static void main(String[] args) {
        System.out.println("Enter the Number");
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();
        int a = 0;
        int b = 1;
        int c = 0;
        int i;
        System.out.print(a + ",");
        System.out.print(b);
        for (i = 1; c < n; i++) {
            c = a + b;
            if (c < n) {
                a = b;
                b = c;
                System.out.print(",");
                System.out.print(c);
            }
        }
    }
}
