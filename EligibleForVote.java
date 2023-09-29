import java.util.Scanner;

public class EligibleForVote {
    public static void main(String[] args) {
        //int age = 27;
        Scanner input = new Scanner(System.in);
        System.out.println("Enter your Age");
        int Age = input.nextInt();
        if (Age >= 18) {
            System.out.println("Eligible For Vote");
        } else {
            System.out.println("Not Eligible For Vote");
        }
    }
}
