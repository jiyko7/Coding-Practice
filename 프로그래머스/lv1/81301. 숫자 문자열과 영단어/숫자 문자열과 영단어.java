class Solution {
    public int solution(String s) {
        int answer = 0;
        String[] dict = {"zero", "one", "two", "three", "four", "five", "six", "seven", "eight", "nine"};
        
        for (int i = 0; i<10; i++){
            s = s.replace(dict[i],i+"");
        }
        return Integer.parseInt(s);
    }
}