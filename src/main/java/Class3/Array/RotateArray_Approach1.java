package Class3.Array;

//This will rotate the given array with the given k elements at first and move the first elements to right.
//Given an array, rotate the array to the right by k steps, where k is non-negative.
//This approach is with extra space.
public class RotateArray_Approach1 {

    //[1,2,3,4,5,6,7] k = 3
    //[7,6,5,4,3,2,1] k = 3
    private static void rotateArray(int[] input, int k){

    int[] extraSpace = new int[input.length];
    int extrapaceIndex = 0;
    for (int i=input.length-k;i<input.length;i++){
        extraSpace[extrapaceIndex] = input[i];
        extrapaceIndex++;
    }
    for (int i=0;i<input.length-k;i++){
        extraSpace[extrapaceIndex] = input[i];
        extrapaceIndex++;
    }

    for (int i=0;i<input.length;i++){
        input[i] = extraSpace[i];
        System.out.println("Rotated value = "+input[i]);
    }

    }

    public static void main(String[] args){
        int input[] = new int[]{1,2,3,4,5,6,7};
        rotateArray(input, 3);
    }
}
