package Class5.Sorting;

import java.util.*;

public class SortByFrequency {

    //Sort by frequency
    //1. Use hashmap: given value as key and frequency as value
    //2. Put the entry set into the arraylist
    //3. sort the list (this will be Decending order o2.compareTo(o1)
    //4. Loop the list and get the value which will be the frequency and print that many times
    private static void sortByFrequecy(int[] input) {

        Map<Integer,Integer> map = new HashMap<>();
        for(int i=0;i<input.length;i++){
            if(map.containsKey(input[i])){
                map.put(input[i], map.get(input[i])+1);
            }else{
                map.put(input[i], 1);
            }
        }
        List<Map.Entry<Integer, Integer>> listOfEntry = new ArrayList<>(map.entrySet());

        Collections.sort(listOfEntry, new Comparator<Map.Entry<Integer, Integer>>(){

                    @Override
                    public int compare(Map.Entry<Integer, Integer> o1, Map.Entry<Integer, Integer> o2) {
                        return o2.getValue().compareTo(o1.getValue());
                    }
                }
            );

        for (Map.Entry<Integer, Integer> entry : listOfEntry)
        {
            int frequency = entry.getValue();
            while (frequency >= 1)
            {
                System.out.print(entry.getKey()+" ");
                frequency--;
            }
        }
    }

   /* private static TreeMap<Integer, Integer> sortByValue(Map<Integer, Integer> hm)
    {
        List<Integer> list = new LinkedList();
        TreeMap<Integer, Integer> sortedMap = new TreeMap<>();
        for (Map.Entry<Integer, Integer> entry : hm.entrySet()) {
            sortedMap.put(entry.getKey(), entry.getValue());
            list.add(entry.getValue());
        }

        for (Map.Entry<Integer, Integer> entry : sortedMap.entrySet()) {
            System.out.println(" >> Key " +entry.getKey()+" value "+entry.getValue());
        }
        return sortedMap;
    }*/

    public static void main(String[] args){
        int[] input = new int[]{2, 5, 2, 8, 5,2,8, 6, 8, 8};
        sortByFrequecy(input);
    }
}
