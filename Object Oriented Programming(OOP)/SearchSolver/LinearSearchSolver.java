package SearchSolver;
// Child class 1: Overrides search() with Linear Search

public class LinearSearchSolver extends SearchSolver {
    public LinearSearchSolver(int[] arr){
        super(arr);
    }
    @Override 
    public int search(int target){
        int[] arr = getArr();
        return search(arr, target);
    }
    private int search(int[] arr, int target){
        System.out.println("Executing Linear Search Algorithm");
        for(int i=0; i<arr.length; i++){
            if(arr[i] == target) {
                return i;
            }
        }
        return -1;
    }
       
}
