package Day2;

import java.util.Scanner;

public class Test {
    public static void main(String[]args){
        System.out.println("Reversing a String");
        Scanner input =new Scanner(System.in);
        System.out.print("Enter the Number: ");
        int num=input.nextInt();
        int rem;
        while (num>0) {
            rem = num % 10;
            System.out.print(rem);
            num = num / 10;
        }
    }
}