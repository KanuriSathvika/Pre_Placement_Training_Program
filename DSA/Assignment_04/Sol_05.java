/**
 💡 **Question 5**
 You have n coins and you want to build a staircase with these coins. The staircase consists of k rows where the ith row has exactly i coins. The last row of the staircase **may be** incomplete.

 Given the integer n, return *the number of **complete rows** of the staircase you will build*.

 */
package Pre_Placement_Assignment.Assignment_04;


public class Sol_05 {
    public static void main(String[] args) {
          int n = 1804289383;
        System.out.println(arrangeCoins(n));
    }
    public static int arrangeCoins(int n) {

        long a=n;

        double x=(-1+(int)Math.sqrt(1+8*a));

        double val=Math.floor(x/2);

        return (int)val;
    }
}
