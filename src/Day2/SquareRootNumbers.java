package Day2;

import java.util.Scanner;

public class SquareRootNumbers {
    public static void main(String[]args){
        System.out.println("Roots of Number");
        int i=1;
        int count=1,res;
        System.out.print("Enter the number: ");
        Scanner input=new Scanner(System.in);
        int num=input.nextInt();
        for(i=1;i<=num;i++){
            res= (int) Math.pow(i,count);
            count++;
            System.out.println(res);
        }
    }
}