package Class8.Queue;

import java.util.Deque;
import java.util.LinkedList;

public class MaxElementInSlidingWindow {

    private void findMaxElementInSlidingWindow(int[] arr, int k){
        Deque<Integer> deque = new LinkedList<>();

        for(int i=0;i<k;i++){
            while(!deque.isEmpty() && arr[i] > arr[deque.peek()]){
                deque.removeLast();
            }

            deque.addLast(i);
        }
    }

}
