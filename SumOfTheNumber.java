public class SumOfTheNumber {
    public  static void main(String args[]){
        int number = 123;
        int sum= 0;
        String num = String.valueOf(number);
        char arr[] = num.toCharArray();
        arr[0]=1;
        arr[1]=2;
        arr[2]=3;
        sum = arr[0]+arr[1]+arr[2];
        //String Sum = arr.toString();
        System.out.println(sum);
    }
}
