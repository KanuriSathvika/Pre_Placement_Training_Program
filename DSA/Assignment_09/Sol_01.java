/**
 💡 **Question 1**

 Given an integer `n`, return *`true` if it is a power of two. Otherwise, return `false`*.

 An integer `n` is a power of two, if there exists an integer `x` such that `n == 2x`.

 **Example 1:**
 Input: n = 1

 Output: true

 **Example 2:**
 Input: n = 16

 Output: true

 **Example 3:**
 Input: n = 3

 Output: false

 */

package Pre_Placement_Assignment.Assignment_09;

public class Sol_01 {
    public static void main(String[] args) {
        int n=16;
        System.out.println(isPowerOfTwo(n));
    }
    public static boolean isPowerOfTwo(int n) {
        int bits=(int)(Math.log(n)/(Math.log(2)));
        int power=1;
        power=power<<(bits);
        System.out.println(power);
        if((n ^ power)==0){
            return true;
        }
        return false;
    }
}
