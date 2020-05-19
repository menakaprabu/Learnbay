package class2.Recursion;

import java.util.ArrayList;
import java.util.List;

public class Subsets {

    private static List<List<Integer>> findSubset(int[] input){
        List<List<Integer>> outputList = new ArrayList<>();
        recursionHelper(outputList, new ArrayList<>(), input, 0);
        return outputList;
    }

    private static void recursionHelper(List<List<Integer>> outputList, List<Integer> subset, int[] input, int start){
        //Add the subset
        outputList.add(new ArrayList<>(subset));
        System.out.println("outputList = "+outputList);
        //Loop the input array
        for(int i=start;i<input.length;i++){
            subset.add(input[i]);
           System.out.println("subset = "+subset);
            recursionHelper(outputList, subset, input, i+1);
            // remove
            subset.remove(subset.size() - 1);
         //   System.out.println("After remove = "+subset);
        }
    }

    //[[], [1], [1, 2], [2]]
    // [[], [1], [1, 2], [1, 2, 3], [1, 3], [2], [2, 3], [3]]
    public static void main(String[] args){
        int[] input = new int[]{1,2}; // [] [1] [2] [1,2]
        List<List<Integer>> resultSet = findSubset(input);
        for (List<Integer> subset: resultSet) {
            System.out.println("Result subset = "+subset);
        }
    }
}
