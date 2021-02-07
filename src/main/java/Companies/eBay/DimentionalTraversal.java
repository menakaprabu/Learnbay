package Companies.eBay;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

public class DimentionalTraversal {

    private static int[] findDiagonalOrder(List<List<Integer>> nums) {
        int count = 0;
        List<Stack<Integer>> list = new ArrayList();
        for (int i = 0; i < nums.size(); i++) {
            List<Integer> oneList = nums.get(i);
            for (int j = 0; j < oneList.size(); j++) {
                //this is id of the diagonal
                int idx = i + j;
                //check if we haven't checked this diagonal before
                if (list.size() < idx + 1) {
                    list.add(new Stack());
                }
                list.get(idx).push(oneList.get(j));
                ++count;
            }
        }
        //now traverse the list of stacks to form the final array
        int[] res = new int[count];
        int p = 0;
        for (Stack<Integer> stack : list) {
            while(!stack.isEmpty()) {
                res[p++] = stack.pop();
            }
        }
        return res;
    }

    public static void main(String[] args){
       List<Integer> list1 = new ArrayList<>();
        list1.add(1);
        list1.add(2);
        list1.add(3);

        List<Integer> list2 = new ArrayList<>();
        list2.add(4);
        list2.add(5);
        list2.add(6);

        List<Integer> list3 = new ArrayList<>();
        list3.add(7);
        list3.add(8);
        list3.add(9);

       List<List<Integer>> inputList = new ArrayList<>();
        inputList.add(list1);
        inputList.add(list2);
        inputList.add(list3);
       findDiagonalOrder(inputList);
    }
}
