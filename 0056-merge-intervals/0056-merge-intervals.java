class Solution {
    public int[][] merge(int[][] intervals) {
       Arrays.sort(intervals, (a, b) -> a[0] - b[0]); // sort by start time

        List<int[]> result = new ArrayList<>();
        int[] last = intervals[0];
        result.add(last);

        for (int i = 1; i < intervals.length; i++) {
            int[] current = intervals[i];
            if (current[0] <= last[1]) {
                // overlap — extend last's end if current reaches further
                last[1] = Math.max(last[1], current[1]);
            } else {
                // no overlap — start a new interval
                last = current;
                result.add(last);
            }
        }

        return result.toArray(new int[result.size()][]);  
    }
}