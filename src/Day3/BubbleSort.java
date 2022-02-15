package Day3;

import java.util.Arrays;

public class BubbleSort {
    public static void main(String[] args) {
        int arr[]={60,82,12,30,3};
        for (int j=arr.length-1;j>0;j--) {
            for (int i = 0; i < j; i++) {
                if(arr[i]>arr[i+1]) {
                    int swap = arr[i];
                    arr[i] = arr[i + 1];
                    arr[i + 1] = swap;
                }
            }
        }
        System.out.println(Arrays.toString(arr));
    }
}
