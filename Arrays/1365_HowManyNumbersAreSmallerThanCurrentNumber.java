// APPROACH 1: TIME COMPLEXITY: O(n) , SPACE COMPLEXITY: O(1)
class Solution{
    public int[] smallerNumbersThanCurrent(int[] nums) {
        int[] count = new int[102];
        int[] ans = new int[nums.length];
        for(int num : nums){
            count[num]++;
        }
        for(int i = 1; i < 102; i++){
            count[i] += count[i-1];
        }
        for(int i = 0; i < nums.length; i++){
            if(nums[i] == 0){
                ans[i] = 0;
            } else {
                ans[i] = count[nums[i]-1];
            }
        }
        return ans;
    }
}

// APPROACH 2: TIME COMPLEXITY: O(n^2) , SPACE COMPLEXITY: O(1)
class Solution{
    public int[] smallerNumbersThanCurrent(int[] nums) {
        int[] ans = new int[nums.length];
        for(int i = 0; i < nums.length; i++){
            int k=0;
            for(int j = 0; j < nums.length; j++){
                if(nums[i] > nums[j]){
                    k++;
                }
            }
            ans[i]=k;
        }
        return ans;
    }
}
