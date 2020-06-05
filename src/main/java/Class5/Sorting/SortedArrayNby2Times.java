package Class5.Sorting;

import java.util.HashMap;
import java.util.Map;

public class SortedArrayNby2Times {

    private static boolean isMoreThenHalfTimesPresent(int[] input, int k){

        Map<Integer, Integer> map = new HashMap<>();

        for(int i=0;i<input.length;i++){
            if(map.containsKey(input[i])){
                map.put(input[i], map.get(input[i])+1);
            }else{
                map.put(input[i], 1);
            }
        }
        if(map.containsKey(k)){
           int halfOfArrSize = input.length/2;
           if(map.get(k) >= halfOfArrSize){
               return true;
           }
        }
        return false;
    }

    public static void main(String[] args){
        int[] input = new int[]{1, 1, 1, 1, 1,1,1,1, 2, 2, 2, 2, 2, 3, 3 };
        boolean  isMoreThenHalfTimesPresent = isMoreThenHalfTimesPresent (input, 1);
        System.out.println("isMoreThenHalfTimesPresent = "+isMoreThenHalfTimesPresent);
    }
}
