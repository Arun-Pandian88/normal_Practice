public class StarPattern_Printing {
    public static void main(String args[]) {
        for (int row = 1; row <= 5; row++) {
            for (int colum = 1; colum <= row; colum++) {
                System.out.print("*");
            }
            System.out.println(" ");
        }
    }
}
