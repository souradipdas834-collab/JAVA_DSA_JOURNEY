class Solution{
    public int[] runningSum(int[] nums){
        int[] ans=new int[nums.length];
        int s=0;
        for(int i=0;i<nums.length; i++){
            s+=nums[i];
            ans[i]=s;
        }
        return ans;
    }
}
// OPTIMISED SOLUTION USING O(N) TIME AND O(1) SPACE
/* public int[] runningSum(int[] nums){
        for(int i=1;i<nums.length; i++){
            nums[i]+=nums[i-1];
        }
        return nums;
    }
}
*/
