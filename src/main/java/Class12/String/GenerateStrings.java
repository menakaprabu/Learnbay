package Class12.String;

import java.util.ArrayList;
import java.util.List;

public class GenerateStrings {

        private static List<String> findSubset(String input){
        List<String> outputList = new ArrayList<>();
        recursionHelper(outputList, "", input, 0);
        return outputList;
    }

        private static void recursionHelper(List<String> outputList, String subset, String input, int start){
        //Add the subset to the resultset list.
    if (subset.length() == 4) {
        outputList.add(new String(subset));
    }
        //Loop the input array to find the subsets
        for(int i=start;i<input.length();i++){
            subset = subset + String.valueOf(input.charAt(i));
            System.out.println("subset = "+subset);
            recursionHelper(outputList, subset, input, i+1);
            // remove
         //   subset.remove(subset.size() - 1);
        }
    }

        //[[], [1], [1, 2], [2]]
        // [[], [1], [1, 2], [1, 2, 3], [1, 3], [2], [2, 3], [3]]
        public static void main(String[] args){
            String input = "abcdef";
        List<String> resultSet = findSubset(input);
        for (String result: resultSet) {
            System.out.println("Result subset = "+result);
        }
    }

}
