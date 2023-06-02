/**
 Given an array of meeting time intervals where intervals[i] = [starti, endi],
 determine if a person could attend all meetings.
 Example 1:
 Input: intervals = [[0,30],[5,10],[15,20]]
 Output: false

 */

package Pre_Placement_Assignment.Assignment_03;

public class Sol_08 {
    public static void main(String[] args) {
          int[][] intervals={
                  {0,30},{5,10},{15,20}
          };
        System.out.println(canAttendMeetings(intervals));
    }
    public static boolean canAttendMeetings(int[][] intervals) {
           for(int i=0;i< intervals.length-1;i++){
               if(intervals[i][1]>intervals[i+1][0]){
                   return false;
               }
           }
           return true;
    }
}
