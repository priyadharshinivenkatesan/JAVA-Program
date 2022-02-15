package Day2;

import java.util.Scanner;

public class Delete_All_Occurrences_Of_a_given_String {
    public static void main(String[]args){
        System.out.println("Delete all occurrences of a given character in a String.");
        Scanner input =new Scanner(System.in);
        System.out.print("Enter a String: ");
        String userinput=input.nextLine();
        String s="";
        System.out.print("Enter a Character to be removed from the string: ");
        String key=input.next();
        int i=0;
        while (i!=userinput.length()-1){
            if (!key.equals(userinput.charAt(i))) {
                s = s + userinput.charAt(i);
            }
            ++i;
        }
        System.out.println(s);
    }
}
