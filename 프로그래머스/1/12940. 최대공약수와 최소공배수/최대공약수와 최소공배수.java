import java.util.List;
import java.util.ArrayList;

class Solution {
    public int[] solution(int n, int m) {

        List<Integer> nList = new ArrayList<>();
        for (int i = 1; i <= n/2; i++){
            if (n%i == 0) {
                nList.add(i);
            }
        }
        nList.add(n);

        
        List<Integer> mList = new ArrayList<>();
        for (int i = 1; i <= m/2; i++){
            if (m%i == 0) {
                mList.add(i);
            }
        }   
        mList.add(m);

        int gcd = 1;
        for (int i : nList) {
            if (mList.contains(i)){
                gcd = i;
            }
        }
        
        int lcm = n*m/gcd;
        
        int[] answer = {gcd, lcm};
        
        return answer;
    }
}