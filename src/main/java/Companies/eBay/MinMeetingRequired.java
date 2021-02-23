package Companies.eBay;

import java.util.Arrays;
import java.util.PriorityQueue;
import java.util.Queue;

public class MinMeetingRequired {
    private static int minMeetingRooms(int[][] intervals) {
        if (intervals.length == 0) {
            return 0;
        }
        Arrays.sort(intervals, (a, b) -> Integer.compare(a[0], b[0]));
        int count = 1;
        Queue<Integer> q = new PriorityQueue<>();
        q.add(intervals[0][1]);
        for (int i = 1; i < intervals.length; i++) {
            
            if (q.peek() > intervals[i][0]) {
                count++;
            } else {
                q.poll();
            }
            q.add(intervals[i][1]);
            
        }
        
        return count;
    }

    public static void main(String[] args){
       int[][] intervals = {{0,30},{5,10},{15,20}};
        int count = minMeetingRooms(intervals);
        System.out.println("count ="+count);
    }
}