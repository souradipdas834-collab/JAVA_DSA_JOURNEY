// APPROACH 1: TIME COMPLEXITY: O(n^2) , SPACE COMPLEXITY: O(1)
class Solution{
    public int numIdenticalPairs(int[] nums){
        int count=0;
        for(int i=0;i<nums.length;i++){
            for(int j=i+1;j<nums.length;j++){
                if(nums[i]==nums[j]){
                    count++;
                }

            }
        }
        return count;
    }
}

// APPROACH 2: TIME COMPLEXITY: O(n) , SPACE COMPLEXITY: O(1)
class Solution{
    public int numIdenticalPairs(int[] nums){
        int totalPairs = 0;
        int[] counts = new int[101];
        for(int i=0;i<nums.length;i++){
            int currentNumber = nums[i];
            totalPairs+ = counts[currentNumber];
            counts[currentNumber]++;
        }
        return totalPairs;
    }
}
            
        
