class Solution {
    public int solution(int n) {
        int answer = 0;
        int a = 0;
        while (a <= n) {
            answer = answer + a;
            a += 2;
        }
        return answer;
    }
}