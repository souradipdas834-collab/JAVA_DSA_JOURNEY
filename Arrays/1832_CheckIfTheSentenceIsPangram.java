// APPROACH 1: SPACE COMPLEXITY:O(1)  TIME COMPLEXITY:O(N)
class Solution{
    public boolean checkIfPangram(String sentence) {
        if(sentence.length()<26) return false;
        boolean[] alphabet = new boolean[26];
        int uniqueCount=0;
        for(int i=0;i<sentence.length();i++) {
            int index = sentence.charAt(i)-'a';
            if(!alphabet[index]){
                alphabet[index]=true;
                uniqueCount++;
            }
            if(uniqueCount==26) return true;
        }
        return false;
    }
}

// APPROACH 2: SPACE COMPLEXITY:O(1)  TIME COMPLEXITY:O(N)
import java.util.HashSet;
class Solution{
    public boolean checkIfPangram(String sentence){
        int k=sentence.length();
        if(k<26) return false;
        HashSet<Character> seen = new HashSet<>();
        for(int i=0;i<k;i++){
            seen.add(sentence.charAt(i));
        }
        return seen.size()==26;
    }
}
            
