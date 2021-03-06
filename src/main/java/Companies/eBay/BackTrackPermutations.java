package Companies.eBay;

import java.util.ArrayList;
import java.util.List;

public class BackTrackPermutations {
    //[1,2,3]
    public static List<List<Integer>> permute(int[] nums) {
        List<List<Integer>> list = new ArrayList<>();
        backtrack(list, new ArrayList<>(), nums);
        return list;
    }

    private static void backtrack(List<List<Integer>> resultList, ArrayList<Integer> tempSet, int[] nums) {

        if (tempSet.size() == nums.length) {
            resultList.add(new ArrayList<>(tempSet));
            return;
        }


        for (int i = 0; i < nums.length; i++) {

            if (tempSet.contains(nums[i])) {
                continue;
            }
            tempSet.add(nums[i]);
            backtrack(resultList, tempSet, nums);
            tempSet.remove(tempSet.size() - 1);  // v v v IMP step....this is where backtrack magic happens...

        }

    }

    public static void main(String[] args){
        List<List<Integer>> out = permute(new int[]{1,2,3});

    }
}
