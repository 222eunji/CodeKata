class Solution {
    public int solution(String[] babbling) {
        
        int answer = 0;
        
        String[] words = {"aya", "ye", "woo", "ma"};
        
        for (String word : babbling) { // 문자열 배열을 하나씩 비교한다.
            String temp = word; 
            String prev = "";
            
            while (!temp.isEmpty()) { //문자가 empty가 되면 반복문 종료
                boolean matched = false;
                
                for (String b : words) {
                    if (temp.startsWith(b) && !b.equals(prev)) { 
                        // 시작 단어가 이전과 중복되지 않은 옹알이면 진행
                        temp = temp.substring(b.length());
                        prev = b;
                        
                        matched = true;
                        break;
                    }
                }
                
                if (!matched) break;
            }
            
            if (temp.isEmpty()) answer++;
        }

        return answer;
    }
}