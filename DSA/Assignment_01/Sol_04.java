/**
 **Q4.** You are given a large integer represented as an integer array digits, where each digits[i] is the
 ith digit of the integer. The digits are ordered from most significant to least significant in left-to-right order.
 The large integer does not contain any leading 0's.

 Increment the large integer by one and return the resulting array of digits.

 **Example 1:**
 Input: digits = [1,2,3]
 Output: [1,2,4]


 */

package DSA.Assignment_01;

import java.util.Arrays;

public class Sol_04 {
    public static void main(String[] args) {
        int[] digits={1,2,3};
        System.out.println(Arrays.toString(plusOne(digits)));
    }
    public static int[] plusOne(int[] digits) {
        int len=digits.length;
        int i=len-1;
        digits[i]=digits[i]+1;
        while(digits[i]>9 && i>0){
            digits[i]=digits[i]%10;
            digits[i-1]=digits[i-1]+1;
            i--;
        }
        if(digits[0]>9){
            int[] plus=new int[len+1];
            System.arraycopy(digits,0,plus,1,plus.length-1);
            plus[0]=1;
            plus[1]=plus[1]%10;
            return plus;
        }
        return digits;
    }
}
