class Solution {
    public int[] solution(int[] lottos, int[] win_nums) {
        
        // 알아볼 수 없는 번호 카운트
        int zero = 0;
        for(int i : lottos) {
           if(i==0) {
            zero++;
           } 
        }
        
        // 일치하는 개수 확인
        int match = 0;
        for(int i : lottos) {
            if(i == 0) { 
                continue;
            }
            
            for(int j : win_nums) {
                if(i == j) {
                    match++;
                    break;
                }
            }
        }
        
        int max = 0;
        int min = 0;
            
        switch(match) {
                case 0:
                    max = 6-zero; min = 6;
                    if(zero == 1) {max = 6;}
                    if(zero == 6) {max = 1;}
                    break;
                case 1:
                    max = 6-zero; min = 6; 
                    break;
                
                case 2:
                    max = 5-zero; min = 5; 
                    break;
                
                case 3:
                    max = 4-zero; min = 4; 
                    break;
                
                case 4:
                    max = 3-zero; min = 3; 
                    break;
                
                case 5:
                    max = 2-zero; min = 2; 
                    break;
                
                case 6:
                    max = 1; min = 1;
                    break;
        }
        
        int[] answer = {max, min};
        return answer;
    }
}