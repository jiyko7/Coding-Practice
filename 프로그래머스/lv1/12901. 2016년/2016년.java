class Solution {
    public String solution(int a, int b) {
        String[] answer = {"FRI","SAT","SUN","MON","TUE","WED","THU"};
        int[] month = {31,29,31,30,31,30,31,31,30,31,30,31};
        int day = b;
        
        for (int i=0; i<a-1; i++){
            day += month[i];
        }
       
        System.out.println(day);
        return answer[(day-1) % 7];
    }
}