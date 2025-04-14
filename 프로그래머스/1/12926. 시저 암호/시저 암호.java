class Solution {
    public String solution(String s, int n) {
        String answer = "";

        for (char c : s.toCharArray()) {
            if (c == ' ') {
                answer += ' ';               
            } else if (Character.isUpperCase(c)) {
                answer += (char) ((c - 'A' + n) % 26 + 'A');
            } else if (Character.isLowerCase(c)) {
                answer += (char) ((c - 'a' + n) % 26 + 'a');
            }
        }
        return answer;
    }
}