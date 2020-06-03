package Class1.Arrays;

//Remove duplicates in the sorted array.
public class RemoveDuplicates {
    private static int removeDuplicates(int[] nums) {

        //i=1, j=0 (1,1) j = 0 and i = 2 so j = 1 and move nums[i] to nums[j].
        int j = 0;
        for(int i=1;i<nums.length;i++){
            if(nums[i] != nums[j]){
                j++;
                nums[j] = nums[i];
            }
        }
        for(int i=0;i<=j;i++){
            System.out.println("removed values = "+nums[i]);
        }

        return j+1;
    }

    public static void main(String[] args){
        int[] input = new int[]{1,1,2,3,3,4};
        removeDuplicates(input);

    }
}
