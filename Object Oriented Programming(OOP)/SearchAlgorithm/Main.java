package SearchAlgorithm;
public class Main {
    public static void main(String[] args){
        BinarySearchAlgorithm bs=new BinarySearchAlgorithm();

        // Calling a method inherited from SearchAlgorithm (Parent)
        bs.printStats();

        // Calling a method inherited from BinarySearchAlgorithm (Child)
        int[] nums={2,5,8,12,16,23,38};
        int index = bs.search(nums,16);
        System.out.println(index != -1 ? "Element found at index: " + index : "Element not found");
    }    
}
