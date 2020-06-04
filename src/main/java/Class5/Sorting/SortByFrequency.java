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
        }
        sortByValue(map);
    }

    private static HashMap<Integer, Integer> sortByValue(Map<Integer, Integer> hm)
    {
        // Create a list from elements of HashMap
        List<Map.Entry<Integer, Integer> > list =
                new LinkedList(hm.entrySet());

        // Sort the list
        Collections.sort(list, new Comparator<Map.Entry<Integer, Integer> >() {
            public int compare(Map.Entry<Integer, Integer> o1,
                               Map.Entry<Integer, Integer> o2)
            {
                return o1.getValue().compareTo(o2.getValue());
            }
        });

        // put data from sorted list to hashmap
        HashMap<Integer, Integer> temp = new LinkedHashMap<Integer, Integer>();
        List sortedByFrequency = new ArrayList();
        for (Map.Entry<Integer, Integer> aa : list) {
            temp.put(aa.getKey(), aa.getValue());
            System.out.println("Sorted array by frequency = "+aa.getKey());
            sortedByFrequency.add(aa.getKey());
        }
        return temp;
    }

    public static void main(String[] args){
        int[] input = new int[]{2, 5, 2, 8, 5, 6, 8, 8};
        sortByFrequecy(input);
    }
}
