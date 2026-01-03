package infosys;

import java.util.*;

public class MinimumMeetingRooms {

    public static int minRooms(int[][] meetings) {

        // Sort by start time
        Arrays.sort(meetings, (a, b) -> a[0] - b[0]);

        // Min heap to store end times
        PriorityQueue<Integer> pq = new PriorityQueue<>();

        for (int[] meeting : meetings) {
            // If room is free, reuse it
            if (!pq.isEmpty() && pq.peek() <= meeting[0]) {
                pq.poll();
            }
            // Allocate room
            pq.offer(meeting[1]);
        }
        return pq.size();
    }

    public static void main(String[] args) {
        int[][] meetings = {
                {9, 10},
                {9, 12},
                {10, 11}
        };

        System.out.println(minRooms(meetings)); // Output: 2
    }
}

