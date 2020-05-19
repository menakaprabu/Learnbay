import java.util.*;

import static java.util.Map.*;

public class SearchEngine {

    private static HashMap<String, Integer> dictionary  = new HashMap<>();
    private static String searchStr = "";

    private static void inputTheDictionary(){
        dictionary.put("I love you", 5);
        dictionary.put("Ironman", 3);
        dictionary.put("I love leetcode",2);
        dictionary.put("I loveFlower",2);
        dictionary.put("My name is java",4);
    }

    public static void searchEngine(char input){

        HashMap<String, Integer> outputMap  = new HashMap<>();
        if(input == '#'){
            if(dictionary.containsKey(searchStr)){
                dictionary.put(searchStr, dictionary.get(searchStr)+1);
            }else{
                dictionary.put(searchStr, 1);
            }
            searchStr = "";
            System.out.println("dictionary = "+dictionary);
        }
        int ascii = input;
        // You can also cast char to int
        int castAscii = (int) input;

        System.out.println("The ASCII value of " + input + " is: " + ascii);
        System.out.println("The ASCII value of " + input + " is: " + castAscii);
        searchStr = searchStr + input;
        for(Map.Entry<String, Integer> entry : dictionary.entrySet()){
           if(entry.getKey().indexOf(searchStr) >= 0){
                outputMap.put(entry.getKey(),entry.getValue());
           }
        }
        System.out.println("Map = "+outputMap);
        List<Map.Entry<String, Integer> > list =
                new LinkedList<>(outputMap.entrySet());

        Collections.sort(list, new Comparator<Map.Entry<String, Integer>>() {
            @Override
            public int compare(Map.Entry<String, Integer> e1, Map.Entry<String, Integer> e2) {
                {
                    if (e1.getValue() < e2.getValue()) {
                        return 1;
                    }
                    if (e1.getValue() > e2.getValue()) {
                        return -1;
                    }
                    return e1.getKey().compareTo(e2.getKey());
                }
            }
        });
        HashMap<String, Integer> sortedMap = new LinkedHashMap<String, Integer>();
        for(int i=0;i<Math.min(list.size(), 3);i++){
            Entry<String, Integer> entry = (Entry<String, Integer>)list.get(i);
            sortedMap.put(entry.getKey(), entry.getValue());
        }

        System.out.println("Output suggestions = "+sortedMap);


    }

    public static void main(String[] args){
        inputTheDictionary();
        searchEngine('I');
        searchEngine(' ');
        searchEngine('#');
      /*  searchEngine('F');
        searchEngine('l');
        searchEngine('o');
        searchEngine('v');
        searchEngine('m');
        searchEngine('o');
        searchEngine('m');
        searchEngine('#');*/
    }
}
