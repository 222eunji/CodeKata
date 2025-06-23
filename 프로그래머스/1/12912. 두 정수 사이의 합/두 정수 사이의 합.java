class Solution {
    public long solution(int a, int b) {
        long m = a; // 큰 수
        long n = b; // 작은 수
        
        if (a<b) {
            m = b;
            n = a;
        } else if (a==b) return a;
        
        long sum=0;
        for(long i=n; i<=m; i++){
            sum+=i;
        }
        return sum;
    }
}