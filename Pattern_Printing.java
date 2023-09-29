public class Pattern_Printing {
    public static void main(String args[]) {
        for (int row = 1; row <= 7; row++) {
            for (int colum = 1; colum <= row; colum++) {
                System.out.print(colum);
            }
            System.out.println(" ");
        }
    }
}
