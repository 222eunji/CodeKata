class Solution {
    public int solution(int[] absolutes, boolean[] signs) {
        int answer = 0;
        
        for(int i=0; i<signs.length; i++){
            answer += (signs[i] == true)? absolutes[i] : (-1)*absolutes[i];
        }
        
        return answer;
    }
}