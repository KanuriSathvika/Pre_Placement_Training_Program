package Pre_Placement_Assignment.Assignment_02;

public class Sol_07 {
    public static void main(String[] args) {
        int[] nums={1,2,2,3};
        System.out.println(isMonotonic(nums));
    }
    public static boolean isMonotonic(int[] nums) {
        int j=1;
        for(int i=0;i<nums.length-1;i++){
            if(nums[i]<=nums[j]){
                j++;
            }
            else if(nums[i]>nums[j]){
                break;
            }
        }
        int k=1;
        for(int i=0;i<nums.length-1;i++){
            if(nums[i]>=nums[k]){
                k++;
            }
            else if(nums[i]<nums[k]){
                break;
            }
        }
        if(j==nums.length || k==nums.length){
            return true;
        }

        return false;
    }
}
