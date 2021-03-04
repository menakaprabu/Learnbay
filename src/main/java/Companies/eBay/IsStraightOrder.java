package Companies.eBay;

import java.util.PriorityQueue;

public class IsStraightOrder {

    private static boolean isNStraightHand(int[] hand, int W) {
      //  if(hand.length % W != 0) return false;

        PriorityQueue<Integer> minHeap = new PriorityQueue<>();
        for(int elem: hand) minHeap.add(elem);

        while(!minHeap.isEmpty()){
            int head = minHeap.poll();
            for(int i=1; i<W; i++)
                if(!minHeap.remove(head+i)) {
                    return false;
                }
        }
        return true;
    }

    public static void main(String[] args){
       int[] input = {1,6,2, 4};//1,2,2,3,3,4,6,7,8
       int w = 2;
       boolean isStraight = isNStraightHand(input, w);
       System.out.println("isStraight = "+isStraight);
    }

}
