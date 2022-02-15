package Day2;

import java.util.Scanner;

public class LCM {
    public static void main(String[]args){
        System.out.println("LCM");
        Scanner input=new Scanner(System.in);
        System.out.print("enter first number: ");
        int num1=input.nextInt();
        System.out.print("enter second number: ");
        int num2=input.nextInt();
        int max=num1>num2?num1:num2;
        while (max>0) {
            if (max%num1 == 0 && max%num2 == 0) {
                System.out.println(max);
                break;
            }
            max++;
        }
        System.out.println(max);

    }
}
