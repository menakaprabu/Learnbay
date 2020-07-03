package Companies.Flexton;

import java.util.*;

public class NumberFrequency {

    private static void kFrequencyNumbers(int[] arr, int k){

        Map<Integer,Integer> map = new HashMap();
        for(int i=0;i<arr.length;i++){
            if(map.containsKey(arr[i])){
                int count = map.get(arr[i]);
                map.put(arr[i], count+1);
            }else{
                map.put(arr[i], 1);
            }
        }

        List<Map.Entry<Integer, Integer>> list = new LinkedList(map.entrySet());

        Collections.sort(list, new Comparator<Map.Entry<Integer, Integer>>() {
            @Override
            public int compare(Map.Entry<Integer, Integer> o1, Map.Entry<Integer, Integer> o2) {
                if(o1.getValue() < o2.getValue()){
                    return 1;
                }else{
                    return -1;
                }
            }
        });

        for(int i=0;i<k;i++){
            System.out.println("Output value = "+list.get(i).getKey());
        }
    }

    public static void main(String[] args){
        int[] arr = new int[]{1,1,1,2,2,3,3,3};
        int k = 2;

        kFrequencyNumbers(arr, k);
    }
}
