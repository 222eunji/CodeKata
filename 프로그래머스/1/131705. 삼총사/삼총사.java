class Solution {
    public int solution(int[] number) {
        int answer = 0;
        int len = number.length;
        
        for(int i=0; i<len -2; i++){
            for(int j=i+1; j<len -1; j++){
                for(int k=j+1; k<len; k++){
                    int sum = number[i] + number[j] + number [k];
                    if(sum == 0){
                        answer++;
                    }    
                }
            }
        }
        
        if (answer == 0) {
            System.out.print("삼총사가 될 수 있는 방법이 없습니다.");     
        }
        
        return answer;
    }
}