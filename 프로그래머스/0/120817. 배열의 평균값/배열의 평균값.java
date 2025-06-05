class Solution {
    public double solution(int[] numbers) {
        double answer = 0;
        double sum = 0;
    
        for (int num : numbers){
            sum += num;
        }
        
        answer = sum / numbers.length;
      
        answer = Math.round(answer * 10.0) / 10.0;
        
        return answer;
    }
}