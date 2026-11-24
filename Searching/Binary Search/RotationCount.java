public class RotationCount {
    public static void main(String[] args) {
        int[] arr = {15, 18, 20, 2, 3, 6, 12};
        System.out.println("The number of rotations in the array is: " + countRotations(arr));
    }
    private static int countRotations(int[] arr) {
        int pivot = findPivot(arr);
        return pivot+1;
    } 
    private static int findPivot(int[] arr) {
        int start = 0;
        int end = arr.length-1;
        while(start <= end){
            int mid = start+(end-start)/2;
            if(mid < end && arr[mid] > arr[mid+1]) return mid;
            if(mid > start && arr[mid] < arr[mid-1]) return mid-1;
            if(arr[mid] > arr[start]) start = mid+1;
            else end = mid-1;
        }
        return -1;
    }   
}
