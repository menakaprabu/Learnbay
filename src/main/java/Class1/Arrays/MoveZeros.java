package Class1.Arrays;

import java.util.Arrays;

public class MoveZeros {

    public static void moveZeroes(int[] nums) {

        int i = 0;
        int j = 0;

        while(i<nums.length && j<nums.length){
                if(nums[j] == 0){
                    j++;
                } else{
                    int temp = nums[i];
                    nums[i] = nums[j];
                    nums[j] = temp;
                    i++;
                    j++;
                }
       }

        for(int k=0;k<nums.length;k++){
            System.out.println("Value = "+nums[k]);
        }

    }

    public static void main(String[] args){
        int[] input = {0,1,0,3,12};
        moveZeroes(input);
    }

}
