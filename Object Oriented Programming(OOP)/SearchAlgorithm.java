public class SearchAlgorithm {
    String name;
    String timeComplexity;
    public SearchAlgorithm(String name, String timeComplexity){
        this.name=name;
        this.timeComplexity=timeComplexity;
    }

    //method inherited by all child classes
    public void printStats(){
        System.out.println("Algorithm: "+ name + " | Time  Complexity: " + timeComplexity);
    }   
}
