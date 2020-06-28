package Class11.PriorityQueue;

import java.util.Collections;
import java.util.PriorityQueue;

/** MAX element
 * 1. Used priority Queue which will maintain the MIN heap internally.
 * 2. Used reverseOrder library do that we need to return the Kth Max element.
 * 3. Add all the elements in the priority queue
 * 4. Poll the element till k and return the kth element.
 */
/**
 * 1. Used priority Queue which will maintain the MIN heap internally.
 * 2. Add all the elements in the priority queue
 * 3. Poll the element till k and return the kth element.
 * Ony difference between largest and smallest is reverseOrder is not needed
 * in the smallest case since the priority Queue is internally maintaining the smallest element
 */
public class KthSmallestLargestElement {

    private static int findKthLargestElement(int[] arr, int k){
        PriorityQueue<Integer> priorityQueue = new PriorityQueue<>(Collections.reverseOrder());

        for (int i=0;i<arr.length;i++){
            priorityQueue.add(arr[i]);
        }
        while (k > 1){
            priorityQueue.poll();
            k--;
        }

        return priorityQueue.poll();
    }

    private static int findKthSmallestElement(int[] arr, int k){
        PriorityQueue<Integer> priorityQueue = new PriorityQueue<>();

        for (int i=0;i<arr.length;i++){
            priorityQueue.add(arr[i]);
        }
        while (k > 1){
            priorityQueue.poll();
            k--;
        }

        return priorityQueue.poll();
    }

    public static void main(String[] args){
        int[] input = new int[]{ 8,3,7,1,2,6};
        int kthLargest = findKthLargestElement(input, 3);
        System.out.println("Kth Largest = "+kthLargest);

        int kthSmallest = findKthSmallestElement(input, 3);
        System.out.println("Kth Smallest = "+kthSmallest);
    }

}
