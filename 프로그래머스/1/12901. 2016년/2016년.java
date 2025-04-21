class Solution {
    public String solution(int a, int b) {
        // key-value로 일수 정하기
        // 날짜 입력받으면 a달까지 더하고 b더하기
        // 나누기의 나머지로 요일 구하기
        
        int month [] = {31,29,31,30,31,30,31,31,30,31,30,31};
        String day [] = {"THU", "FRI", "SAT", "SUN", "MON", "TUE", "WED"};
        int days = 0;
        
        for(int i = 0; i < a-1; i++) {
            days += month[i];
        }
        
        days += b;
        
        String answer = day[days%7];
        return answer;
    }
}