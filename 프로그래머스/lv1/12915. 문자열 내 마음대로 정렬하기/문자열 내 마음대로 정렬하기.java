import java.util.*;
class Solution {
    public String[] solution(String[] strings, int n) {
        String[] answer = new String[strings.length];
        char[] arrch = new char[strings.length];
        int i = 0;
        for (String s : strings){
            arrch[i++] = s.charAt(n);    
        }
        
        Arrays.sort(arrch);
        Arrays.sort(strings);
        
        
        for (int j=0; j<strings.length; j++){
            for (int k=0; k<strings.length; k++){
                if (strings[k].equals(""))
                    continue;
                if (arrch[j] == strings[k].charAt(n)){
                    System.out.println(strings[k]);
                    answer[j] = strings[k];
                    strings[k] = "";
                    break;
                }
            }
        }
            
        return answer;
    }
}