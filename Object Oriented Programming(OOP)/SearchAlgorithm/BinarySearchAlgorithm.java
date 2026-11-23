package SearchAlgorithm;

public class BinarySearchAlgorithm extends SearchAlgorithm {
     
    //child constructor calling parent constructor via super()
    public BinarySearchAlgorithm(){
        super("Binary Search", "O(log n)");
    }
    public int search(int[] arr, int target){
        int start=0;
        int end=arr.length-1;
        while(start<=end){
            int mid=start+(end-start)/2;
            if(target==arr[mid]) return mid;
            else if(target<arr[mid]) end=mid-1;
            else start=mid+1;
        }
        return -1;
    }
}
