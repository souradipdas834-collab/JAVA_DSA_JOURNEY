// APPROACH 1: TIME COMPLEXITY: O(n^2) , SPACE COMPLEXITY: O(n) 
class Solution{
    public int[] createTargetArray(int[] nums, int[] index){
        int[] ans = new int[nums.length];
        for(int i=0;i<nums.length;i++){
            int num=nums[i];
            int idx=index[i];
            for(int j=i;j>=idx;j--){
                ans[j]=ans[j-1];
            }
            ans[idx]=num;
        }
        return ans;
    }
}

// APPROACH 2: TIME COMPLEXITY: O(n^2) , SPACE COMPLEXITY: O(n)
import java.util.ArrayList;
import java.util.List;
class Solution{
    public int[] createTargetArray(int[] nums, int[] index){
        List<Integer> list=new ArrayList<>();
        for(int i=0;i<nums.length;i++){
            list.add(index[i],nums[i]);
        }
        int[] ans=new int[nums.length];
        for(int i=0;i<nums.length;i++){
            ans[i]=list.get(i);
        }
        return ans; 
    }
}