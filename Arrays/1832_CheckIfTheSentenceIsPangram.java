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