/**
 💡 **Question 7**
 You are given an m x n matrix M initialized with all 0's and an array of operations ops, where ops[i] = [ai, bi] means M[x][y] should be incremented by one for all 0 <= x < ai and 0 <= y < bi.

 Count and return *the number of maximum integers in the matrix after performing all the operations*

 **Example 1:**

 **Input:** m = 3, n = 3, ops = [[2,2],[3,3]]

 **Output:** 4

 **Explanation:** The maximum integer in M is 2, and there are four of it in M. So return 4.

 */

package Pre_Placement_Assignment.Assignment_04;

public class Sol_07 {
    public static void main(String[] args) {
      int m = 3, n = 3;
      int[][] ops = {{2,2},{3,3}};
        System.out.println(maxCount(m,n,ops));
    }
    public static int maxCount(int m, int n, int[][] ops) {
        int mi=m,ma=n;
        for(int i=0;i<ops.length;i++){
            int x=ops[i][0],y=ops[i][1];
            mi=Math.min(mi,x);
            ma=Math.min(ma,y);
        }
        return mi*ma;
    }
}
