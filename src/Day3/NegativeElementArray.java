package Day3;

public class NegativeElementArray {
    public static void main(String[]args){
        int arr[]={10,-45,90,45,-2,0};
        for(int i=0;i<arr.length;i++){
            if(arr[i]>=0){
                System.out.print(arr[i]+" ");
            }
        }
    }
}
