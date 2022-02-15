package Day2;

import java.util.Scanner;

public class PrimeOrNot {
    public static void main(String[]args){
        Scanner input=new Scanner(System.in);
        System.out.println("Enter a number: ");
        int a=input.nextInt();
        boolean b=false;
        for(int i=2;i<a;i++){
            if(a%i==0){
                b=true;
            }
        }
        if(b==true){
            System.out.println("Not Prime Number");
        }
        else{
            System.out.println("Prime Number");
        }
    }
}
