class Solution {
    public int solution(int n) {
        int answer = 0;
        
        for(int i = 2; i<n; i++) {
            int a = n % i;
                if (a == 1) {
                    answer = i;
                    break;
                }
        }
        return answer;
    }
}