package Day2;

import java.util.Scanner;

public class NeonNumber {
    public static void main(String[]args){
        System.out.println("NEON NUMBER OR NOT");
        Scanner input =new Scanner(System.in);
        System.out.print("Enter a number: ");
        int a= input.nextInt();
        int backup=a;
        a=a*a;
        int rem=0;
        while (a!=0) {
            rem = rem + (a % 10);
            a = a / 10;
        }
        if(backup==rem){
            System.out.println("Its a Neon Number.");
        }
        else{
            System.out.println("Not a Neon Number.");
        }
    }
}
