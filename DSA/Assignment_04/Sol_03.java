/**

 💡 **Question 3**
 Given a 2D integer array matrix, return *the **transpose** of* matrix.

 The **transpose** of a matrix is the matrix flipped over its main diagonal, switching the matrix's row and column indices.

 **Example 1:**

 Input: matrix = [[1,2,3],[4,5,6],[7,8,9]]

 Output: [[1,4,7],[2,5,8],[3,6,9]]

 */

package Pre_Placement_Assignment.Assignment_04;

import java.util.Arrays;

public class Sol_03 {
    public static void main(String[] args) {
        int[][] matrix = {{1,2,3},{4,5,6},{7,8,9}};
        System.out.print("[");
        for(int i=0;i<matrix.length;i++){
            if(i== matrix.length-1){
                System.out.print(Arrays.toString(matrix[i]));
            }
            else {
                System.out.print(Arrays.toString(matrix[i]) + ",");
            }

        }
        System.out.println("]");

    }
    public static int[][] transpose(int[][] matrix) {
        int c=matrix[0].length;
        int[][] mat=new int[c][matrix.length] ;
        for(int i=0;i<c;i++){
            for(int j=0;j<matrix.length;j++){
                mat[i][j]=matrix[j][i];
            }
        }
        return mat;
    }
}
