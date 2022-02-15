package Day3;

import java.lang.reflect.Array;
import java.util.Arrays;

public class LeftShiftArray {
    public static void main(String[]args){
       int []arr ={10,20,30,40,50};
       int i=0;
       int temp=arr[i];
       for(i=0;i< arr.length-1;i++){
           arr[i]=arr[i+1];
       }
       arr[i]=temp;
        System.out.println(Arrays.toString(arr));
    }
}
