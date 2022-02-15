package Day3;

import java.util.Scanner;

public class Gcd {
    public static void main(String[]args){
        int a,b,min;
        Scanner input=new Scanner(System.in);
        a=input.nextInt();
        b=input.nextInt();
        min=a<b?a:b;
        while (min >= 2) {
            if(a%min==0 && b%min==0){
                System.out.print(min);
                break;
            }
            min--;
        }
    }
}
