package Companies.Flexton;

import java.util.*;

public class AnagramWords {

    private static void printAnagrams(String[] words){

        HashMap<String,List<String>> map = new HashMap<>();
        for(int i=0;i<words.length;i++){
            char[] word = words[i].toCharArray();
            Arrays.sort(word);
            String sortedWord = new String(word);
            if(map.containsKey(sortedWord)){
                List<String> wordList = map.get(sortedWord);
                wordList.add(words[i]);
                map.put(sortedWord, wordList);
            }else{
                List<String> list = new ArrayList<>();
                list.add(words[i]);
                map.put(sortedWord,list);
            }
        }

        for(Map.Entry<String, List<String>> entry: map.entrySet()){
            List<String> anagramList = entry.getValue();
            for (int i=0;i<anagramList.size();i++){
                System.out.println(" anagramList.get(i) " +anagramList.get(i));
            }
        }
    }

    public static void main(String[] args){
        String arr[] = { "cat", "dog", "tac", "god", "act" };
        printAnagrams(arr);
    }
}
