package Class8.Queue;

import java.util.Queue;
import java.util.LinkedList;

public class StackWithTwoQueues {

    // Two inbuilt queues
    static Queue<Integer> q1 = new LinkedList<Integer>();
    static Queue<Integer> q2 = new LinkedList<Integer>();

    static Queue<Integer> singleQueue = new LinkedList<Integer>();

    // To maintain current number of
    // elements
    static int curr_size;

    StackWithTwoQueues()
    {
        curr_size = 0;
    }

    public void enQueue(int value){
        //1 2
        q2.add(value);//2
        while(!q1.isEmpty()){//1
            q2.add(q1.peek());//2, 1
            q1.remove();//nothing
        }

        Queue<Integer> temp = q1;
        q1 = q2;//2, 1,
        q2 = temp;
    }

    // Push operation with single Queue
    void push(int val)
    {
        // get previous size of queue
        int size = singleQueue.size();

        // Add current element
        singleQueue.add(val);

        // Pop (or Dequeue) all previous
        // elements and put them after current
        // element
        for (int i = 0; i < size; i++)
        {
            // this will add front element into
            // rear of queue
            int x = singleQueue.remove();
            singleQueue.add(x);
        }
    }

}
