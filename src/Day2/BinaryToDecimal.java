package Day2;

import java.util.Scanner;

public class BinaryToDecimal {
    public static void main(String[]args){
        System.out.println("Binary to Decimal");
        Scanner input=new Scanner(System.in);
        int binary=input.nextInt();
        for (int i=0;i<=4;i++) {
            int rem = binary % 10;
            int cal = (int) (rem * Math.pow(2, i));
            System.out.println(cal);
        }
    }
}
