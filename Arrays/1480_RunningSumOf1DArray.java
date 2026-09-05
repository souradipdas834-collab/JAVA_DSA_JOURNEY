class Solution{
    // Approach 1: Brute Force / Naive Solution
    // Time Complexity: O(N) | Space Complexity: O(N)
    public int[] runningSum(int[] nums){
        int[] ans=new int[nums.length];
        int s=0;
        for(int i=0;i<nums.length; i++){
            s+=nums[i];
            ans[i]=s;
        }
        return ans;
    }
    // Approach 2: Optimised Solution (In-place modification)
    // Time Complexity: O(N) | Space Complexity: O(1)
     public int[] runningSum(int[] nums){
        for(int i=1;i<nums.length; i++){
            nums[i]+=nums[i-1];
        }
        return nums;
    }
}
 

