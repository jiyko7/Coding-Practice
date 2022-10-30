class Solution {
    public int solution(String dartResult) {
        int answer = 0;
        dartResult = dartResult.replace("10","k");
        char[] arrch = dartResult.toCharArray();
        int count = 0;
        int before = 0;
        int now = 0;
        for (char c : arrch){
            if (c=='*'){
                before *= 2;
                now *= 2;
            }
            else if (c=='#'){
                now *= -1;
            }
            else{
                if (count == 2){
                    count = 0;
                    answer += before;
                }
                switch(c){
                    case 'S':
                        now = (int)Math.pow(now, 1);
                        count++;
                        break;
                    case 'D':
                        now = (int)Math.pow(now, 2);
                        count++;
                        break;
                    case 'T':
                        now = (int)Math.pow(now, 3);
                        count++;
                        break;
                    case 'k':
                        before = now;
                        now = 10;
                        break;
                    default:
                        before = now;
                        now = c-'0';
                        break;
                        
                }
            }
            System.out.println("*");
            System.out.println(before);
            System.out.println(now);
            System.out.println(answer);
        }
        answer += before;
        answer += now;
        return answer;
    }
}