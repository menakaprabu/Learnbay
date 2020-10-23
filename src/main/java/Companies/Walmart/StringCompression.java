package Companies.Walmart;

import java.util.HashMap;
import java.util.Map;

public class StringCompression {

    private static void stringCompression(char[] chars){
        Map<Character, Integer> map = new HashMap<>();

        for(int i=0;i<chars.length;i++){
            if(map.containsKey(chars[i])){
                map.put(chars[i], map.get(chars[i])+1);
            }else {
                map.put(chars[i], 1);
            }
        }

        String output = "";

        for(Map.Entry<Character,Integer> entry : map.entrySet()){
            if(entry.getValue() == 1){
                output = output + entry.getKey();
            }else{
                output = output + entry.getKey() + entry.getValue();
            }
        }
        System.out.println("Output = "+output);
    }

    private static void stringCompressionInPlace(char[] chars)
    {
        int count = 1;
        int arrIndex = 0;
        for(int i=0;i<chars.length;i++){
            while (i < chars.length - 1 && chars[i] == chars[i + 1]) {
                count++;
                i++;
            }
            if(count == 1){
                chars[arrIndex++] = chars[i];

            }else {
                chars[arrIndex++] = chars[i];
                String num = String.valueOf(count);
                for(int j=0;j<num.length();j++){
                    chars[arrIndex++] = num.charAt(j);
                }
            }
            count = 1;
        }
        for(int i=0;i<arrIndex;i++){
            System.out.println(" Value = "+chars[i]);
        }
    }

    public static void main(String[] args){
       char input[] = new char[]{'a','b','b','c','c','c'};
        stringCompressionInPlace(input);
    }
}
