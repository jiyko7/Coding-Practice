class Solution {
    public String solution(String s) {
        String answer = "";
        int length = s.length();
        int start = length % 2 == 0? length/2-1: length/2;
        length /= 2;
        return s.substring(start, length+1);
    }
}