class Solution {
    public String solution(String[] cards1, String[] cards2, String[] goal) {
        
        int j = 0;
        int k = 0;
        
        for(int i = 0; i < goal.length; i++){
            String word = goal[i];
            
            if(j < cards1.length) {            
                if(word.equals(cards1[j])) {
                    j++;
                    
                    continue;
                }
            }
            
            if(k < cards2.length) {                             
                if(word.equals(cards2[k])) {
                    k++;

                    continue;
                }            
            }   
            
             return "No";
        }
        
        return "Yes";
    }
}