package day07Loops;

public class deneme {
    public static void main(String[] args) {

        // Example 5 = Type code to find the sum of the digits in on integer
        //              587==> 5+8+7 = 20
        int num = 587;
        num = Math.abs(num);

        int sumOfDigits=0;
        for (int i=587; i>0 ; i=i/10){

            sumOfDigits = sumOfDigits + num %10;
        }
        System.out.print(sumOfDigits);

        int number= 745896;
        number=Math.abs(number);



    }
}
