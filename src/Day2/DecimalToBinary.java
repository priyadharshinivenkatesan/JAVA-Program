package Day2;

import java.util.Scanner;

public class DecimalToBinary {
    public static void main(String[]args){
        System.out.println("Decimal to Binary.");
        Scanner input =new Scanner(System.in);
        System.out.print("Enter the decimal: ");
        int value=input.nextInt();
        int rem;
        String binary="";
        while (value>=1) {
            rem = value % 2;
            binary=binary+rem;
            value = value / 2;
        }
        System.out.println("Decimal after Conversion to Binary");
        for(int i=binary.length()-1;i>=0;i--){
            System.out.print(binary.charAt(i));
        }
    }
}
