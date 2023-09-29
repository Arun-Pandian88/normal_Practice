import java.util.Scanner;
public class Find_The_PrimeNumber {
    public static void main(String[] args) {
        System.out.println("Enter The Number");
        Scanner input = new Scanner(System.in);

        int number = input.nextInt();
        int i;
        int count = 0;
        for (i = 1; i <= number; i++) {
            if (number % i == 0) {
                count++;
            }
        }
        if (count == 2) {
            System.out.println(number + " " + "prime number");
        } else {
            System.out.println(number + " " + "Not a prime number");
        }
    }
}
