package LastMinuteRevisions;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.lang.String;

public class HashMapCode {

    private static void hashMapRetrieval(){
        Map<Integer, String> map = new HashMap();
        map.put(0,"A");
        map.put(1,"B");
        map.put(2,"C");
        map.put(3,"D");

        //Iterator
        Iterator iterator = map.entrySet().iterator();
        while (iterator.hasNext()){
            Map.Entry entry = (Map.Entry)iterator.next();
            System.out.println("Iterator Map key = "+entry.getKey());
            System.out.println("Iterator Map Value = "+entry.getValue());
        }

        for(Map.Entry entry : map.entrySet()){
            System.out.println("For loop Map key = "+entry.getKey());
            System.out.println("For loop Map Value = "+entry.getValue());
        }
    }

    public static void main(String[] args){
        hashMapRetrieval();
    }
}
