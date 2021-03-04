package Companies.eBay;

import java.util.Stack;

public class DesignHashMapUsingStacks {
        Stack st1;
        Stack st2;
        /** Initialize your data structure here. */
        public DesignHashMapUsingStacks() {
            st1 = new Stack<Integer>();
            st2 = new Stack<Integer>();
        }

        /** value will always be non-negative. */
        public void put(int key, int value) {
            remove(key);
            st1.push(key);
            st2.push(value);
        }

        /** Returns the value to which the specified key is mapped, or -1 if this map contains no mapping for the key */
        public int get(int key) {
            if(st1.contains(key)){
                int index = st1.indexOf(key);
                return (int)st2.get(index);
            }
            return -1;
        }

        /** Removes the mapping of the specified value key if this map contains a mapping for the key */
        public void remove(int key) {
            if(st1.contains(key)){
                int index = st1.indexOf(key);
                st1.remove(index);
                st2.remove(index);
            }
        }

    public static void main(String[] args){
        DesignHashMapUsingStacks designHashMap = new DesignHashMapUsingStacks();
        designHashMap.put(4, 2);
        designHashMap.put(3, -1);
        designHashMap.put(1, 9);
        designHashMap.put(-2, 10);
        System.out.println("designHashMap value = "+designHashMap.get(-2));
        System.out.println("mod ="+4%10);
    }
    }
