class Solution {
    public int[] solution(int[] answers) {
        
        int i = 0;
    
        int a = 0;
        int idxA = 0;
        int[] answersA = {1,2,3,4,5};
        
        int b = 0;
        int idxB = 0;
        int[] answersB = {2,1,2,3,2,4,2,5};

        int c = 0;
        int idxC = 0;
        int[] answersC = {3,3,1,1,2,2,4,4,5,5};

        
        while (i < answers.length) {
            if (answers[i] == answersA[idxA]) {
                a++;
            }
            
            if (answers[i] == answersB[idxB]) {
                b++;
            }
            
            if (answers[i] == answersC[idxC]) {
                c++;
            }
            
            i++;
            idxA = (idxA + 1) % 5;           
            idxB = (idxB + 1) % 8;
            idxC = (idxC + 1) % 10;   
        }
        
        int max = Math.max(a, Math.max(b, c));
        
        int size = 0;
        if(a==max) size++;
        if(b==max) size++;
        if(c==max) size++;

        int[] answer = new int[size];
        int idx = 0;
        
        if(a==max) answer[idx++] = 1;
        if(b==max) answer[idx++] = 2;
        if(c==max) answer[idx++] = 3;

        return answer;
    }
}