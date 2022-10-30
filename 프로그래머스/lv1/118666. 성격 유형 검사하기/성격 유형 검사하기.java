class Solution {
    public String solution(String[] survey, int[] choices) {
        int indexa = 0;
        int indexb = 0;
        String answer = "";
        char[] test = {'R','T','C','F','J','M','A','N'};
        int [] score = new int[8];
        for (int i = 0; i<survey.length; i++){
            for (int j = 0; j<test.length; j++){
                if (test[j] == survey[i].charAt(0)) {
                    indexa = j;
                    if (j%2 == 0) {
                        indexb = j+1;
                    }	
                    else {
                        indexb = j-1;
                    }
                    break;
                }
            }
            if (choices[i]>=5){
                score[indexb] += choices[i]-4;
            }
            else if (choices[i]<=3){
                score[indexa] += 4-choices[i];
            }
            else{
            }
        }
        
        for (int k = 0; k<score.length; k+=2){
            if (score[k] >= score[k+1]){
                answer += test[k];
            }
            else{
                answer += test[k+1];
            }
        }
        return answer;
    }
}