class Solution {
    public String solution(String phone_number) {
        int n = phone_number.length();
        
        String answer = "*";
        answer = answer.repeat(n-4) + phone_number.substring(n-4);

        return answer;
    }
}