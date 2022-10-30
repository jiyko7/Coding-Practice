class Solution {
    public int solution(int n) {
        int answer = 0;
        int countA = 0;
        int countB;
        
        String a = Integer.toBinaryString(n);
        char[] arrayA = a.toCharArray();
        String b;
        char[] arrayB;
        
        for (int i = 0; i < arrayA.length; i++){
            if (arrayA[i] == '1')
                countA++;
        }
        
        while (true){
            b = Integer.toBinaryString(++n);
            arrayB = b.toCharArray();
            countB = 0;
            for (int i = 0; i < arrayB.length; i++){
                if (arrayB[i] == '1')
                    countB++;
            }
            if (countA == countB){
                return n;
            }
        }    
    }
}