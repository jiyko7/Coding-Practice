import java.util.*;

class Solution {
    long[] answer;
    ArrayList<Long> array;
    public long[] solution(int n, long k) {
        answer = new long[n];
        array = new ArrayList<>();
        long count = 1;
        for (long i=1;i<=n;i++){
            count *= i;
            array.add(i);
        }
        k--;
        
        int index = 0;
        int temp = 0;
        while (n>0) {
            count = count/n;
            temp = (int)(k/count);
            answer[index++] = array.get(temp);
            array.remove(temp);
            k = k % count;
            n=n-1;
        }
  
        return answer;
    }
}