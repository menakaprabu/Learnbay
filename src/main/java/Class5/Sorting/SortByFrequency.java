package Class5.Sorting;

import java.util.*;

public class SortByFrequency {

    private static void sortByFrequecy(int[] input) {

        Map<Integer,Integer> map = new HashMap();
        for(int i=0;i<input.length;i++){
            if(map.containsKey(input[i])){
                map.put(input[i], map.get(input[i]+1));
            }else{
                map.put(input[i], 1);
            }
          /*  if(i+1 < input.length && input[i] > input[i+1]){
                int temp = input[i];
                input[i] = input[i+1];
                input[i+1] = temp;
            }*/
        }

        List<Map.Entry<Integer,Integer>> list = new LinkedList<>(map.entrySet());

        Collections.sort(list, new Comparator<Map.Entry<Integer, Integer>>() {
            @Override
            public int compare(Map.Entry<Integer, Integer> o1, Map.Entry<Integer, Integer> o2) {
                return o1.getValue().compareTo(o2.getValue());
            }
        });

        HashMap<Integer, Integer> temp = new HashMap<>();
        for (Map.Entry<Integer, Integer> aa : list) {
            temp.put(aa.getKey(), aa.getValue());
        }

        for(int i=0;i<temp.size();i++){
            System.out.println("Output = "+temp.get(i));
        }
    }

    public static void main(String[] args){
        int[] input = new int[]{2, 5, 2, 8, 5, 6, 8, 8};
        sortByFrequecy(input);
    }
}
