import java.util.Arrays;

class Solution {
    public int solution(String[] want, int[] number, String[] discount) {
        int answer = 0;
        int size = discount.length;
        
        int total = 0;
        for (int i= 0; i < number.length; i++){
            total += number[i];
        }
        String[] item = new String[total];
        
        int index = 0;
        for (int j = 0; j<want.length; j++){
            for (int k = 0; k<number[j]; k++){
                item[index] = want[j];
                index++;
            }
        }
        Arrays.sort(item);
        
        
        for (int l = 0; l<size; l++){
            if (l+total > size){
                break;
            }
            String[] temp = new String[total];
            for (int m = l; m<l+total; m++){
                temp[m-l] = discount[m];
            }
            Arrays.sort(temp);
            if (Arrays.equals(temp, item)){
                answer++;
                
            }
        }
        return answer;
    }
}