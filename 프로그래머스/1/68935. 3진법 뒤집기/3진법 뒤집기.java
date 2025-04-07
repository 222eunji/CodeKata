import java.util.List;
import java.util.ArrayList;

class Solution {
    public int solution(int n) {
        ArrayList<Integer> list = new ArrayList<>();
        
        while(n>0){
           list.add(n % 3);
            n/=3;
        }
        
        int answer = 0;
        
        for(int i= 0; i < list.size(); i++){
            answer += list.get(i) * Math.pow(3,list.size()- 1 -i);
        }
        
        return answer;
    }
}