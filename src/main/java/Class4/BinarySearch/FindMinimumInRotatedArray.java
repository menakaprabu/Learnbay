package Class4.BinarySearch;

//Find the min value in the rotated array. Rotated at some point.
public class FindMinimumInRotatedArray {

    private static int findMinInRotatedArray(int[] input){

        int start = 0;
        int end = input.length-1;

        while (start < end){

            int mid = (start+end)/2;

            if(mid >0 && input[mid] < input[mid-1]){
                return input[mid];
            }

            if(input[start] <= input[mid]  && input[mid] > input[end]) {
                 start = mid+1;
            }
            return input[start];
        }
        return -1;
    }

    public static void main(String[] args){
        int[] input = new int[]{4,5,6,7,1,2,3};
        int output = findMinInRotatedArray(input);
        System.out.println("Min output = "+output);
    }
}
