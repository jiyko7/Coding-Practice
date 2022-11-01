import java.util.Arrays;
import java.util.Comparator;

class Solution {
    public String solution(int[] numbers) {
        String answer = "";
        boolean check = true;
        
        int index = 0;
        String[] list = new String[numbers.length];

        for (int n: numbers){
            if (n!=0){
                check = false;
            }
            list[index++] = String.valueOf(n);
        } 
        
        if(check){
            return "0";
        }

        Arrays.sort(list,new Comparator<String>() {
            @Override
            public int compare(String o1, String o2) {
                
                return (o2+o1).compareTo(o1+o2);
                
            }
        });

        for (int i = 0; i <list.length; i++){
            answer += list[i];
        }
        
        
        return answer;
    }
}