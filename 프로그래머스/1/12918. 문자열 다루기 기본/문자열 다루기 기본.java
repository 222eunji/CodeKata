class Solution {
    public boolean solution(String s) {
                
        boolean answer = true;
        
         // 문자열의 길이 확인
        if (!(s.length() == 4 ||(s.length() == 6))) {
            return answer = false;
        }

  
        // 숫자로만 구성되어있는지 확인
        for (int i = 0; i < s.length(); i++)
            if(!Character.isDigit(s.charAt(i))) {
                return answer = false;
            }
        
        return answer;
    }
}