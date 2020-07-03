package Class1.Arrays;

import java.util.*;
import java.lang.Integer;

public class FindPair {

    private static void findPair(int[] arr, int k){

        Map<Integer,Integer> map = new HashMap<Integer, Integer>();

        for(int i=0;i<arr.length;i++){ // x - givenNum = k. So x = k + givenNum. (x - 0 = 1. So x = 1-0: )
            map.put(arr[i]-k,arr[i]);// -1, 0: 0,-1: -1,-2
        }

        for(int i=0;i<arr.length;i++){
           if(map.containsKey(arr[i])){
               List<Integer> list = new ArrayList<>();
                System.out.println(" Pair "+map.get(arr[i])+ " "+arr[i]);
           }
        }
    }

    private static void findPair1(int[] arr, int k){

        Set<Integer> set = new HashSet<Integer>();

        for(int i=0;i<arr.length;i++){
            if(set.contains(arr[i] - k)){
                System.out.println("arr[i] - k = "+(arr[i] - k));
            }
        }


    }

    public static void main(String[] args){
        int[] input = new int[]{ 0, -1, -2, 2, 1};
        findPair(input, 1);
    }
}
//[[1, 0], [0, -1], [-1, -2], [2, 1]]