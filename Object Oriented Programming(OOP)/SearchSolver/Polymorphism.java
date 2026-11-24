package SearchSolver;

public class Polymorphism {
    public static void main(String[] args){
        int[] sortedArray = {2,5,8,12,16,23,38};
        int target = 23;
        SearchSolver solver;

        // RUNTIME POLYMORPHISM (Upcasting):
        // The reference type is SearchSolver (Parent class), but the actual object is (Child class) 
        solver = new LinearSearchSolver(sortedArray);
        System.out.println("Found at index: " + solver.search(8));
        System.out.println("---------------------------------");
        solver = new BinarySearchSolver(sortedArray);
        System.out.println("Found at index: " + solver.search(target));
    
    
    }
    
}
