package Companies.eBay;

import java.util.Collections;
import java.util.PriorityQueue;

class MedianFinder {

    // Min heap - holds last half - we get the least of larger elements 
    PriorityQueue<Integer> maxHeap;
    
    // Max heap - holds first half - we get the greatest of smaller elements 
    PriorityQueue<Integer> minHeap;
    
    /** initialize your data structure here. */
    
    public MedianFinder() {
        minHeap = new PriorityQueue<>();
        maxHeap = new PriorityQueue<>(Collections.reverseOrder());
    }
    
    public void addNum(int num) {
        
        // enqueue into max heap (first half)
        maxHeap.offer(num);
        
        // dequeue largest elemnt in (first half) & enqueue in (second half)
        minHeap.offer(maxHeap.poll());
        
        // balance both heaps (first half always contains same (even) or size+1 (odd) )
        if(maxHeap.size() < minHeap.size()){
            
            // enqueue back if size unbalanced
            maxHeap.offer(minHeap.poll());
            
        }
    }
    
    
    public double findMedian() {
                
        // odd elements median - max heap (first half) contains the extra element
        if(minHeap.size() < maxHeap.size()){
            return maxHeap.peek();
        }
        // even elements - get largest in maxHeap & smallest in minHeap - median
        double sum = 0.0;
        
        sum+= maxHeap.peek();
        sum+=minHeap.peek();
        return sum/2;
    }

    public static void main(String[] args){
        MedianFinder medianFinder = new MedianFinder();
        medianFinder.addNum(2);
        medianFinder.addNum(3);
        medianFinder.addNum(4);
        medianFinder.addNum(5);
        System.out.println(medianFinder.findMedian());
    }
}