package Companies.Walmart;

import java.util.*;

public class DegreeOfArray {

    static class ElemantInfo{
        int count;
        int leftIndex;
        int rightIndex;

        public ElemantInfo(int count, int leftIndex, int rightIndex){
            this.count = count;
            this.leftIndex = leftIndex;
            this.rightIndex = rightIndex;
        }
    }

    private static void degreeOfArray(int[] input){

        Map<Integer, ElemantInfo> map = new HashMap();
        for(int i=0;i<input.length;i++){
            if(map.containsKey(input[i])){
                ElemantInfo elemantInfo = map.get(input[i]);
                elemantInfo.count++;
                elemantInfo.rightIndex = i;
                map.put(input[i], elemantInfo);
            }else{
                ElemantInfo elemantInfo = new ElemantInfo(1, 0, 0);
                map.put(input[i], elemantInfo);
            }
        }

        int minSoFar = Integer.MAX_VALUE;
        List<Map.Entry<Integer, ElemantInfo>> list = new LinkedList(map.entrySet());

        Collections.sort(list, new Comparator<Map.Entry<Integer, ElemantInfo>>() {
            @Override
            public int compare(Map.Entry<Integer, ElemantInfo> o1, Map.Entry<Integer, ElemantInfo> o2) {
                if(o1.getValue().count < o2.getValue().count){
                    return 1;
                }else{
                    return -1;
                }
            }
        });

        System.out.println("Output value = "+(list.get(0).getValue().rightIndex - list.get(0).getValue().leftIndex));
    }

    public static void main(String[] args){
        int[] arr = new int[]{1,2,2,3,1,4,2};
        int[] arr1 = new int[]{1, 2, 2, 3, 1};
        degreeOfArray(arr);
        degreeOfArray(arr1);
    }
}
