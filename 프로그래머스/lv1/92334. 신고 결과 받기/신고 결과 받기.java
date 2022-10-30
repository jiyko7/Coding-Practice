import java.util.*;

class Solution {
    public int[] solution(String[] id_list, String[] report, int k) {
        int[] answer = new int[id_list.length];
        check[] checklist = new check[id_list.length];
        String[] temp;
        int Index = 0;
        for (String id : id_list){
            checklist[Index++] = new check(id);
        }
        
        for (String re : report){
            temp = re.split(" ");
            for (int i = 0; i<checklist.length; i++){
                if (temp[1].equals(checklist[i].name)){
                    if (checklist[i].reportP.indexOf(temp[0]) == -1){
                        checklist[i].reportP.add(temp[0]);
                        checklist[i].count++;
                        
                    }
                }
            }
        }
        
        for (check c : checklist){
            if(c.count >= k){
                for (String p : c.reportP){
                    for (int j=0; j<id_list.length; j++){
                        if(id_list[j].equals(p))
                            answer[j]++;
                    }
                }
            }
        }
        
        
        return answer;
    }
    
    class check{
        String name;
        ArrayList<String> reportP = new ArrayList<String>();
        int count = 0;
        
        public check(String name){
            this.name = name;
        }

    }
}

