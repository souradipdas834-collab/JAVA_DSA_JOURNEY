package SearchSolver;
// Parent Class
public class SearchSolver {
    //1.  Encapsulated field: strictly private to this class
    private int[] arr;
    //2. Constructor  validates and store the array once
    public SearchSolver(int[] arr){
        setArr(arr);
    }
    //3. Controlled Setter method with validation
    public void setArr(int[] arr){
        if(arr == null || arr.length ==0){
            throw new IllegalArgumentException("Array cannot be null or empty");
        }
        this.arr = arr;
    }
    //4. Procted Getter: Only Child classes can access it
    protected int[] getArr(){
        return this.arr;
    }
    public int search(int target){
        return -1;
    }  
}
