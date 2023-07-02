/**
 💡 **Question 1**

 Given a non-negative integer`x`, return*the square root of*`x`*rounded down to the nearest integer*.
 The returned integer should be**non-negative**as well.

 You**must not use**any built-in exponent function or operator.

 - For example, do not use`pow(x, 0.5)`in c++ or`x ** 0.5`in python.

 */


package Pre_Placement_Assignment.Assignment_11;

public class Sol_01 {
    public static void main(String[] args) {
        int x=8;
        System.out.println(mySqrt(x));

    }
    public static int mySqrt(int x) {
        if(x<2){
            return x;
        }
        int low=1,high=x/2;
        int val=0;
        while(low<=high){
            int  mid=low+(high-low)/2;
            if(mid<=x/mid){
                val=mid;
                low=mid+1;
            }
            else if(mid>x/mid){
                high=mid-1;
            }
        }
        return val;
    }
}
