package Class3.Array;

public class RotateArray_Approach3 {

    private static void rotateArrayApproach3(int[] arr, int k){
        rotateHelper(arr, 0, arr.length-1);//Rotate complete array
        rotateHelper(arr, 0, k-1);//Rotate 0 till k-1
        rotateHelper(arr, k, arr.length-1);//Rotate k till length-1;
        for(int i=0;i<arr.length;i++){
            System.out.println("Rotated array = "+arr[i]);
        }
    }

    private static int[] rotateHelper(int[] input, int start, int end){
        while(start < end){
            int temp = input[start];
            input[start] = input[end];
            input[end] = temp;
            start++;
            end--;
        }
        return input;
    }

    public static void main(String[] args){
        System.out.println("<<<<<<<<<<<<<<<<<<< First input >>>>>>>>>>>>>>");
        int input[] = new int[]{1,2,3,4,5,6,7};
        rotateArrayApproach3(input, 3);
        System.out.println("<<<<<<<<<<<<<<<<<<< Second input >>>>>>>>>>>>>>");
        int input2[] = new int[]{-1,10,4,200,9};
        rotateArrayApproach3(input2,2);
    }
}
