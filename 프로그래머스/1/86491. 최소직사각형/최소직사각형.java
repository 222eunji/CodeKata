class Solution {
    public int solution(int[][] sizes) {
        for(int[] card : sizes) {
            int temp = card[0];
            if (card[0] < card[1]) {
                card[0] = card[1];
                card[1] = temp;
            }
        }
        
        int answer = 0;
        int width = 0;
        int length = 0;
        
        for(int[] card : sizes) {
            if(card[0] > width) {
                width = card[0];
            }
            if(card[1] > length) {
                length = card[1];
            }
        }
        
        answer = width * length;
        
        return answer;
    }
}