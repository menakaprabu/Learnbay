package Class3.Array;

public class RotateArray_Approach2 {

    //[1,2,3,4,5,6,7] k = 3
    //7,1,2,3,4,5,6
    //6,7,1,2,3,4,5
    //5,6,7,1,2,3,4
    private static void rotateArray(int[] input, int k){

        for(int i=0; i<k; i++) {
            int lastValue =input[input.length - 1];
            for(int j=input.length-1;j>0;j--) {
                input[j]=input[j-1];
            }
            input[0]=lastValue;
        }

        for (int i=0;i<input.length;i++){
            System.out.println("rotated array = "+input[i]);
        }
    }

    public static void main(String[] args){
        int input[] = new int[]{1,2,3,4,5,6,7};
        rotateArray(input, 3);
        System.out.println("<<<<<<<<<<<<<<<<<<< Second input >>>>>>>>>>>>>>");
        int input2[] = new int[]{1,2,3,4,5,6,7};
        rotateArray(input2,5);
    }

}
