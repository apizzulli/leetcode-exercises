import java.util.*;

class Solution {
    public static void main(String[] args) {
        merge(new int[][]{{1,4},{4,5}});
    }
    public static int[][] merge(int[][] intervals) {
        List<Integer> ints = new ArrayList();
        int repeats = 0;
        if(intervals.length<2)
            return intervals;
        for(int row = 0; row  < intervals.length-1; row+=2){
            //[[1,4],[0,4]]
            if(intervals[row][0] <= intervals[row+1][1]){
                ints.add(intervals[row+1][0]);
                ints.add(intervals[row+1][1]);
            }
            else if(intervals[row][1] >= intervals[row+1][0]){
                ints.add(intervals[row][0]);
                ints.add(intervals[row+1][1]);
                intervals[row+1][0] = intervals[row][0];
                repeats++;
            }
            else{
                ints.add(intervals[row][0]);
                ints.add(intervals[row][1]);
                ints.add(intervals[row+1][0]);
                ints.add(intervals[row+1][1]);
            }
        }
        int [][] newIntervals = new int[intervals.length-repeats][2];
        int intsIndex = 0;
        for(int row = 0; intsIndex < ints.size()-1;row++){
            newIntervals[row][0] = ints.get(intsIndex);
            newIntervals[row][1] = ints.get(intsIndex+1);
            intsIndex+=2;
        }
        System.out.println("done");
        return newIntervals;
    }
}