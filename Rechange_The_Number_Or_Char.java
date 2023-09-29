public class Rechange_The_Number_Or_Char {
    public static void main(String args[]){
        //StringBuilder name = new StringBuilder("Arun Pandian");
        String number = "1004";
        //Scanner input = new Scanner(System.in);
        //int num = input.nextInt();
        char ch [] = number.toCharArray();
        StringBuilder str = new StringBuilder();
        //if(num==0){
        // ch[0] =
        ch[0] = '1';
        ch[1] = '5';
        ch[2] = '5';
        ch[3] = '4';

        str.append(ch[0]);
        str.append(ch[1]);
        str.append(ch[2]);
        str.append(ch[3]);

        String s = str.toString();
        // print string
        System.out.println("String = " +s);
        //
        //System.out.println(ch);
    }
}
