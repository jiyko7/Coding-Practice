import java.util.Arrays;

class Solution {
    public long solution(long n) {
        long answer = 0;
        String number = String.valueOf(n);
        char[] numch = number.toCharArray();
        char[] numch1 = new char[numch.length];
        Arrays.sort(numch);
        for(int i =0; i<numch.length;i++){
            numch1[numch.length-1 - i] =  numch[i];
        }
        answer = Long.parseLong(new String(numch1));
        return answer;
    }
}