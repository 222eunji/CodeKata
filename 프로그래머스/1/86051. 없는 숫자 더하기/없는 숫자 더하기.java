class Solution {
    public int solution(int[] numbers) {
        
        int total = 0+1+2+3+4+5+6+7+8+9;
        
        for (int i : numbers )
        {
            total -= i;
        }
        
        return total;
    }
}