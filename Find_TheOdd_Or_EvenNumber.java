import java.util.Scanner;

public class Find_TheOdd_Or_EvenNumber {
    public static void main(String args[]) {
        System.out.println("Enter the Numbers");
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();
        //for (int i = 0; i <= n; i++) {
        if (n % 2 == 0) {
            System.out.print("Even Number");
        } else {
            System.out.print("Odd Number");
        }
    }
}
