package Day2;

import java.util.Scanner;

public class Palindrome {
    public static void  main(String[]args){
        Scanner input =new Scanner(System.in);
        System.out.print("Enter a String: ");
        String a=input.nextLine();
        String b="";
        for (int i=a.length()-1;i>=0;i--){
            b=b+a.charAt(i);
        }
        if(a.equals(b)){
            System.out.println("Reversed String: "+b);
            System.out.println("Palindrome");
        }
        else{
            System.out.println("Reversed String: "+b);
            System.out.println("Not a palindrome");
        }
    }
}
