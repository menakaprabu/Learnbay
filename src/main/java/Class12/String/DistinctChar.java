package Class12.String;

import java.util.*;

public class DistinctChar {

    private static boolean distinctChar(String input){
        Map<Character, Integer> map = new HashMap<>();
        for(int i=0;i<input.length();i++){
            if(map.containsKey(input.charAt(i))){
                map.put(input.charAt(i), map.get(input.charAt(i)) + 1);
            }else{
                map.put(input.charAt(i), 1);
            }
        }

        List<Map.Entry<Character, Integer>> list = new ArrayList<>(map.entrySet());

        Collections.sort(list, new Comparator<Map.Entry<Character, Integer>>() {
            @Override
            public int compare(Map.Entry<Character, Integer> o1, Map.Entry<Character, Integer> o2) {
                return o2.getValue().compareTo(o1.getValue());
            }
        });

        //Ex: xyzz
        //Ex: xxxxyyyzz
        //Ex: zzzyyxx
        int maxFrquency = Integer.MIN_VALUE;
        for (Map.Entry<Character, Integer> entry : list)
        {
           int frequency = entry.getValue();
           if( maxFrquency == entry.getValue() || (frequency-1 == entry.getValue())) {
               return true;
           }else{
             maxFrquency = entry.getValue();
           }
        }
        return false;
    }

    public static void main(String[] args) {
        String input1 = "xyzz";
        System.out.println("Valid String input 1= " + distinctChar(input1));

        String input2 = "xxxxyyyzz";
        System.out.println("Valid String intput 2= " + distinctChar(input2));

        String input3 = "zzzyyxx";
        System.out.println("Valid String input 3 " + distinctChar(input3));

        String input4 = "xxzzyy";
        System.out.println("Valid String input 4 " + distinctChar(input4));
    }
}
