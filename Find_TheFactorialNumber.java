import java.util.Scanner;
public class Find_TheFactorialNumber {
    public static void main(String args[]){
        System.out.println("Enter the number");
        Scanner input = new Scanner(System.in);
        int NumberOffactorial = input.nextInt();
        long factorial = 1;
        //nt factorial = NumberOffactorial *(NumberOffactorial-1);
        for(int i =1;i<=NumberOffactorial;i++){
            factorial= factorial*i;
        }
        System.out.println("Number of factorial"+"  "+":" +NumberOffactorial);
        System.out.println(" factorial"+"  "+":" +factorial);
    }
}
