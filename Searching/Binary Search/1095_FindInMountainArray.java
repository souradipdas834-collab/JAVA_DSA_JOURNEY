interface MountainArray {
    int get(int index);
    int length();
}
class Solution {
    public int findInMountainArray(int target, MountainArray mountainArr) {
        int peak=peakIndexInMountainArray(mountainArr);
        int firstTry=orderAgnosticBS(mountainArr, 0, peak, target);
        if(firstTry != -1) return firstTry;
        return orderAgnosticBS(mountainArr, peak+1, mountainArr.length()-1, target);
    }
    private int peakIndexInMountainArray(MountainArray mountainArr){
        int start=0;
        int end=mountainArr.length()-1;
        while(start<end){
            int mid=start+(end-start)/2;
            if(mountainArr.get(mid)<mountainArr.get(mid+1)) start=mid+1;
            else end=mid;
        }
        return start;
    } 
    private int orderAgnosticBS(MountainArray mountainArr, int start, int end, int target){
        boolean isAsc=mountainArr.get(start)<mountainArr.get(end);
        while(start<=end){
            int mid=start+(end-start)/2;
            if(mountainArr.get(mid)==target) return mid;
            if(isAsc){
                if(target<mountainArr.get(mid)) end=mid-1;
                else start=mid+1;
            }
            else{
                if(target>mountainArr.get(mid)) end=mid-1;
                else start=mid+1;
            }
        }
        return -1;
    }   
}
