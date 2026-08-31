class Solution{
    public int[] buildArray(int[] nums) {
        int[] ans = new int[nums.length];
        for(int i=0; i<nums.length; i++){
            ans[i] = nums[nums[i]];
        }
        return ans;
    }
}
// OPTIMIZED APPROACH : Math optimization to 0(1) Auxiliary Space

// class Solution {
//     public int[] buildArray(int[] nums) {
//         int n=nums.length;
//         for(int i=0;i< nums.length;i++){
//             int targetIndex=nums[i]%n;
//             int targetValue=nums[targetIndex]%n;
//             nums[i]=nums[i]+(targetValue*n);
//         }
//         for(int i=0;i< nums.length; i++){
//             nums[i]=nums[i]/n;
//         }
//         return(nums);
//     }
// }
