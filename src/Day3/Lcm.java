package Day3;

import java.util.Scanner;

public class Lcm {
    public static void main(String[]args){
        int a,b,max;
        Scanner input=new Scanner(System.in);
        System.out.print("Enter a first number: ");
        a=input.nextInt();
        System.out.print("Enter a second number: ");
        b=input.nextInt();
        max=a>b?a:b;
        while (max>0) {
            if (max % a == 0 && max % b == 0) {
                System.out.println("LCM: "+max);
                break;
            }
            max++;
        }
    }
}
