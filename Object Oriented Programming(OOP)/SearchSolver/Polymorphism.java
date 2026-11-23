package SearchSolver;

public class Polymorphism {
    public static void main(String[] args){
        int[] sortedArray = {2,5,8,12,16,23,38};
        int target = 23;
        SearchSolver solver;

        // RUNTIME POLYMORPHISM (Upcasting):
        // The reference type is SearchSolver (Parent class), but the actual object is (Child class) 
        solver = new LinearSearchSolver();
        System.out.println("Found at index: " + solver.search(sortedArray, target));
        System.out.println("---------------------------------");
        solver = new BinarySearchSolver();
        System.out.println("Found at index: " + solver.search(sortedArray, target));
    
    
    }
    
}
