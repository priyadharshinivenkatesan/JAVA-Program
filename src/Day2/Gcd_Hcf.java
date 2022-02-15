package Day2;

import java.util.Scanner;

public class Gcd_Hcf {
    public static void main(String []args){
        System.out.println("GCD / HCF ");
        //no1= 12, no2=30
        //12 6 3 2  | 30 15 10 6 5 3 2
        Scanner input =new Scanner(System.in);
        System.out.print("Enter First Number: ");
        int num1=input.nextInt();
        System.out.print("Enter Second Number: ");
        int num2=input.nextInt();
        int min=num1<num2?num1:num2;
        while (min>=2) {
            if (num1 % min == 0 && num2 % min == 0) {
                System.out.println(min);
            }
            min--;
        }
        }
}
