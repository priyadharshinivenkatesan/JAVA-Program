package Day3;

import java.util.Arrays;

public class RightShiftArray {
    public static void main(String[]args){
        int arr[]={10,20,30,40,50};
        int i=0;
        int temp=arr[arr.length-1];
        for(i= arr.length-1;i>0;i--){
            arr[i]=arr[i-1];
        }
        arr[i]=temp;
        System.out.println(Arrays.toString(arr));
    }
}
