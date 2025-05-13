class Solution {
    public int solution(int n, int m, int[] section) {
        int count = 0;
        int max = 0;
        
        for (int i : section) {
            if (i < max) {
                continue;
            }
            
            count++;
            max = i + m;
        }
        
        return count;
    }
}