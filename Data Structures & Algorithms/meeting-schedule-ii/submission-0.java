/**
 * Definition of Interval:
 * public class Interval {
 *     public int start, end;
 *     public Interval(int start, int end) {
 *         this.start = start;
 *         this.end = end;
 *     }
 * }
 */

class Solution {
    public int minMeetingRooms(List<Interval> intervals) {
        int n = intervals.size();
        int[] start = new int[n];
        int[] end = new int[n];
        
        for(int i = 0; i < n; i++){
            int s = intervals.get(i).start;
            int e = intervals.get(i).end;

            start[i] = s;
            end[i] = e;
        }

        Arrays.sort(start);
        Arrays.sort(end);

        int days = 0;
        int s = 0;
        int e = 0;

        while(s < n && e < n){
            //System.out.println(start[s]);
            //System.out.println(end[e]);
            if(start[s] < end[e]){
                days++;
            }else{
                e++;
            }
            s++;
        }
        return days;
    }
}
