import java.util.*;
// APPROACH 1: TIME COMPLEXITY: O(N)  SPACE COMPLEXITY: O(1)

class Solution{
    public int countMatches(List<List<String>> items, String ruleKey, String ruleValue){
        int index=0;
        switch(rulekey){
            case "type":
                index=0;
                break;
            case "color":
                index=1;
                break;
            case "name":
                index=2;
                break;
        }
        int count=0;
        for(int i=0;i<items.size();i++){
            List<String> item=items.get(i);
            String attributeValue=item.get(index);
            if(attributeValue.equals(ruleValue)){
                count++;
            }
        }
        return count;
    }
}

//APPROACH 2: TIME COMPLEXITY: O(N)  SPACE COMPLEXITY: O(1)
class Solution{
    public int countMatches(List<List<String>> items, String ruleKey, String ruleValue){
        int index = ruleKey.equals("type")?0:ruleKey.equals("color")?1:2;
        return (int)items.stream().filter(item->item.get(index).equals(ruleValue)).count();
    }

}
