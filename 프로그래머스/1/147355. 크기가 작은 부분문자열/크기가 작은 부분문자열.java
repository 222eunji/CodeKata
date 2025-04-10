class Solution {
    public int solution(String t, String p) {
        int answer = 0;
        int len_t = t.length();
        int len_p = p.length();
        
        if(len_p == 1){
            long[] longArray = new long[len_t];
            char[] strArray = t.toCharArray();
            for(int i = 0; i < len_t; i++) {
                longArray[i] = Long.parseLong(Character.toString(strArray[i]));
            }
            
            for(long i : longArray) {
                if(i <= Long.parseLong(p)) {
                    answer++;
                }
            }
            
            return answer;
        }
        
        for(int i = 0; i+len_p <= len_t; i++) {
            String str = t.substring(i,i+len_p);
            long num = Long.parseLong(str);
            
            if(num <= Long.parseLong(p)) {
                answer++;
            }
        }

        return answer;
    }
}