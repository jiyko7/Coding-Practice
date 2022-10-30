class Solution {
    public String solution(String s) {
        String answer = "";
        
        String[] array = s.split(" ");
        int max = Integer.parseInt(array[array.length-1]);
        int min = Integer.parseInt(array[array.length-1]);
        
        for (String ss : array){
            int temp = Integer.parseInt(ss);
            if (max < temp)
                max = temp;
            if (min > temp)
                min = temp;
        }
        answer += min + " " + max;
        return answer;
    }
}