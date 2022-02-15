package Day3;

import java.util.Scanner;

public class NeonNumberFinding {
    public static void main(String[]args){
        int a,rem;
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a number: ");
        a=input.nextInt();
        int count=0;
        int square=a*a;
        while (square!=0){
        rem=square%10;
        count=rem+count;
        square=square/10;
        }
        System.out.println(count);
        if(a==count){
            System.out.println("Neon Number");
        }
        else {
            System.out.println("Not a Neon Number");
        }
    }
}
