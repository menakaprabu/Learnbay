package Companies;

/**
 * Given a sorted (in ascending order) integer array nums of n elements and a target value,
 * write a function to search target in nums. If target exists, then return its index,
 * otherwise return -1.
 *
 * Use Binary Search algorithm
 */
public class Care {

    private static int search(int[] nums, int target) {

        int fromStart = 0;
        int fromLast = nums.length - 1;

        while(fromStart <= fromLast){

            int mid = (fromStart + fromLast)/2;

            if(nums[mid] == target){
                return mid;
            }
            //[-1,0,3,5,9,12], 9
            if(target > nums[mid]){
                fromStart = mid + 1;
            }else{
                fromLast = mid - 1;
            }

        }
        return -1;
    }

    public static void main(String[] args){
        int[] input = {-1,0,3,5,9,12};
        int index = search(input, 9);
        System.out.println("index = "+index);
    }
}
