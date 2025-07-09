class Solution {
    public int solution(int left, int right) {
        int answer = 0;
        
        for(int i = left; i<=right; i++){
            
            // i의 약수 개수 구하기
            int total = 0;
            for(int n = 1; n<=i/2; n++){
                if(i % n == 0){
                    total++;
                }
            } total++;
            
            answer += (total%2==1)? -i : +i;
        } 
        
        return answer;
    }
}