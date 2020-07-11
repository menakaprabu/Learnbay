package Companies.Flexton;

import java.util.HashMap;
import java.util.Map;

public class RepeatedChars {

    private static void repeatedPattern(String input){
        Map<String, Integer> map = new HashMap();

        String conseqString = "";
        for(int i=0;i<input.length()-1;i++){
             conseqString = conseqString + input.charAt(i);
            if(i+1 < input.length() && conseqString.charAt(conseqString.length()-1) == input.charAt(i+1)){
                conseqString = conseqString + input.charAt(i+1);
                if(conseqString.length() == 2 && map.containsKey(conseqString)){
                    map.put(conseqString,map.get(conseqString)+1);
                }else if(conseqString.length() == 2 ){
                    map.put(conseqString,1);
                }
            }else{
                conseqString = "";
            }
        }
        for(Map.Entry<String,Integer> entry: map.entrySet()){
            System.out.println("Conseq Seq: "+entry.getKey() +" get Value = "+entry.getValue());
        }
    }

    public static void main(String[] args){
        String input = "abbbcddddeffabbbbbbcccssssssss";
        repeatedPattern(input);
    }
}
