import java.util.*;

class Solution {
    public Integer[] solution(int[] numbers) {
        Integer[] answer = {};
        HashSet<Integer> set = new HashSet<Integer>();
        
        for (int i = 0; i< numbers.length; i++){
            for (int j = 0; j< numbers.length; j++){
                if (i!=j)
                    set.add(numbers[i] + numbers[j]);
            }
        }
        answer = set.toArray(new Integer[0]);
        Arrays.sort(answer);
        return answer;
    }
}