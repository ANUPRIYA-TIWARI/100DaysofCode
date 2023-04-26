class Solution {
    public int eraseOverlapIntervals(int[][] intervals) {
		Arrays.sort(intervals, (a, b) -> a[1] - b[1]);
		if (intervals == null || intervals.length == 0) return 0;
		int end = intervals[0][1];
		int cnt = 1;
		for (int i = 0; i < intervals.length; i++) {
			if (intervals[i][0] >= end) {
				end = intervals[i][1];
				cnt++;
			}
		}
		return intervals.length - cnt;
	}
}
    
