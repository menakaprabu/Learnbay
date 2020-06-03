package Class5.Sorting;

public class SortArrayInWaveForm {

    //This will sort the given array in the wave form (value at the odd index should be less then value at the even index on both sides
    private static void sortWave(int[] input){
       // input: {10, 5, 6, 3, 2, 20, 100, 80}
       // Output {10, 5, 6, 2, 20, 3, 100, 80}
        //step 1: check the even index value with odd index value
        for(int i=0;i<input.length;i+=2){
            if(i>0 && input[i-1] > input[i]){
                swap(input, i-1, i);
            }

            if(i<input.length && input[i] < input[i+1]){
                swap(input, i, i+1);
            }
        }
    }

    private static void swap(int[] arr, int i, int j){
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }

    public static void main(String[] args){
        int[] input = new int[]{10, 5, 6, 3, 2, 20, 80, 100};
        sortWave(input);
        for(int i=0;i<input.length;i++){
            System.out.println("Output = "+input[i]);
        }
    }
}
