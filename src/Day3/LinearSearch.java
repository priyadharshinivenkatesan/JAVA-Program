package Day3;

import java.util.Scanner;

public class LinearSearch {
    public static void main(String[]args){
        int arr[]={10,20,30,40,50};
        Scanner input=new Scanner(System.in);
        System.out.print("Enter a number: ");
        int num=input.nextInt();
        boolean a=false;
        int b=0;
        for(int i= arr.length-1;i>=0;i--){
            if(num==arr[i]){
                a=true;
                b=i;
            }
        }
        if(a==true){
            System.out.println(num +" is present in the given array at position "+b);
        }
        else{
            System.out.println(num+" is not present in the given array.");
        }

    }
}
//class is a template or blueprint for object
//object is called instance of a class or class variable