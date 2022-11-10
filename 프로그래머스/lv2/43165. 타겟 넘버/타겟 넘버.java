class Solution {
    static int[] answer = {0};
    static int[] number;
    public int solution(int[] numbers, int target) {
        number = numbers;
        
        add(number[0], 0, target, 0);
        add(-1*number[0], 0, target, 0);
        
        
        return answer[0];
    }
    
    static void add(int num, int index, int target, int sum){
        sum += num; 
        index++;
        
        if (index==number.length){
            if (sum == target){
                
                answer[0]++;
            }
            return;
        }
        
        add(number[index], index, target, sum);
        add(-1*number[index], index, target, sum);
           
    }
}