package Day3;

import java.util.Arrays;

public class SelectionSort {
    public static void main(String[] args) {
        int arr[]={3,9,15,6,7};
        for (int i=0;i<arr.length;i++) {
            for (int j=i+1;j<arr.length;j++) {
                if (arr[i] > arr[j]) {
                    int temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                }
            }
        }
        System.out.println(Arrays.toString(arr));
    }
}
