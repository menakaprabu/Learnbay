package Companies.Walmart;

public class FindNumberInRotatedArray {

    //4,5,6,7,0,1,2,3
    //4,5,6,0,1,2,3
    private static int binarySearch(int[] input, int target){

        int start = 0;
        int end = input.length - 1;

        while(start <= end){
            int mid = (start + end)/2;

            if(input[mid] == target){
                return mid;
            }
            if(input[start] <= input[mid]) {
                if (target >= input[start] && target <= input[mid]) {
                    end = mid - 1;
                } else {
                    start = mid + 1;
                }
            }

             if(input[mid] <= input[end]) {
                 if (target > input[mid] && target <= input[end]) {
                     start = mid + 1;
                 } else {
                     end = mid - 1;
                 }
             }
            if(input[start] > input[mid] && input[mid] > input[end]) {
                return -1;
            }
        }
        return -1;
    }

    public static void main(String[] args){
     //   int[] input = {4,5,6,7,0,1,2};
      //  int output = binarySearch(input, 0);
     //   System.out.println(" output value = "+output);

        int[] input1 = {5,3,1};
        int output1 = binarySearch(input1, 0);
        System.out.println("output1 value = "+output1);
    }

}
