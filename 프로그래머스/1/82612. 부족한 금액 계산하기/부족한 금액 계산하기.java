class Solution {
    public long solution(int price, int money, int count) {
        long answer = 0;
        
        long total = 0;
        
        for (int i = 1; i<=count; i++){
            total += (long) price * i;
        }
        
        if (money - total < 0){
            return (money - total) * -1;
        }

        return answer;
    }
}