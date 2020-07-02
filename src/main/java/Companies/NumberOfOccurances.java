package Companies;

import java.util.*;

public class NumberOfOccurances {

    private static void kFrequencyNumbers(int[] arr){

        Map<Integer,Integer> map = new HashMap();
        for(int i=0;i<arr.length;i++){
            if(map.containsKey(arr[i])){
                int count = map.get(arr[i]);
                map.put(arr[i], count+1);
            }else{
                map.put(arr[i], 1);
            }
        }

        for(Map.Entry<Integer,Integer> value:map.entrySet()){
            System.out.println("Output element = "+value.getKey()+ " Occurances "+value.getValue());
        }
    }

    public static void main(String[] args){
        int[] arr = new int[]{1,2,3,2,4,1,1};

        kFrequencyNumbers(arr);
    }
}
