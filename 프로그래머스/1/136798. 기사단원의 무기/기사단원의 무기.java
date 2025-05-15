class Solution {
    public int solution(int number, int limit, int power) {

        int answer = 0;
        int count = 0;
        int num = 1;

        while (num <= number) {
            
            // m의 약수 개수(공격력) 구하기
            for (int i = 1; i <= Math.sqrt(num); i++) {
                if (i*i == num) {count++;}
                else if (num%i == 0) {count += 2;}
            }
            
            // 약수 개수가 제한 수치를 초과하면 공격력을 power로 바구기
            if (count > limit) {
                count = power;}
            
            answer += count;
            count = 0; // count 0으로 초기화
            num++;
            
        }
        return answer;
    }
}