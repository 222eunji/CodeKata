class Solution {
    public String solution(int[] food) {
        int[] divfood = new int[food.length-1];
        
        for(int i = 1; i<food.length; i++) {
            divfood[i-1] = food[i] / 2;
        }
        
        String leftfood = "";
        for (int i = 0; i<divfood.length; i++) {
            String str = Integer.toString(i+1);
            if (divfood[i] == 0) {
                continue;
            }
            
            leftfood +=str.repeat(divfood[i]);         
        }
        
        StringBuffer sb = new StringBuffer(leftfood);
        String rightfood = sb.reverse().toString();
        
        String answer = leftfood + "0" + rightfood;
            
        return answer;
    }
}