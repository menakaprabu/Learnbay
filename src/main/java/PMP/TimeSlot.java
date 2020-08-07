package PMP;

public class TimeSlot {

    private static int[] meetingPlanner(int[][] slotsA, int[][] slotsB, int dur) {
        // your code goes here
        int ia = 0;
        int ib = 0;

        while (ia < slotsA.length && ib < slotsB.length) {
            int start = Math.max(slotsA[ia][0], slotsB[ib][0]);
            int end = Math.min(slotsA[ia][1], slotsB[ib][1]);

            if (start + dur <= end) {
                return new int[]{start, start + dur};
            }

            if (slotsA[ia][1] < slotsB[ib][1]) {
                ia++;
            }
            else{
                ib++;
            }
        }
        return new int[]{};
    }

    public static void main(String[] args) {
        int[][] slotsA = { {10, 50},{60, 120}, {140, 210}};
        int[][] slotsB = {{0, 15}, {60, 70}};
        int dur = 8;
        int[] output = meetingPlanner(slotsA, slotsB, dur);
        System.out.println("Overlapping timeslots start = "+output[0] + " End = "+output[1]);
    }
}
