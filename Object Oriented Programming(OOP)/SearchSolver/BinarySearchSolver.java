package SearchSolver;
// Child class 2: Overrides search() with Binary Search
public class BinarySearchSolver extends SearchSolver {
    @Override 
    public int search(int[] arr, int target){
        // System.out.println("Executing Binary Search Algorithm");
        // int start=0;
        // int end=arr.length-1;
        // while(start<=end){
        //     int mid=start+(end-start)/2;
        //     if(target==arr[mid]) return mid;
        //     else if(target<arr[mid]) end=mid-1;
        //     else start=mid+1;
        // }
        // return -1;
        return search(arr, 0, arr.length - 1, target);
    }  

    //Method Overloading: search() method with additional parameters for start and end indices
    public int search(int[] arr, int start, int end, int target){
        System.out.println("Executing Binary Search Algorithm");
        while(start<=end){
            int mid=start+(end-start)/2;
            if(target==arr[mid]) return mid;
            else if(target<arr[mid]) end=mid-1;
            else start=mid+1;
        }
        return -1;  
    }
}
