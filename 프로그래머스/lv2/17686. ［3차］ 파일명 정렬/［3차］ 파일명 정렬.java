import java.util.*;

class Solution {
    public String[] solution(String[] files) {
        
        ArrayList<FileT> array = new ArrayList<>();
        
        String temphead;
        String tempnumber;
        String temptail;        
        boolean flag;
        for (int i = 0; i< files.length; i++){
            temphead = "";
            tempnumber = "";
            temptail = "";
            flag = true;
            char[] temp = files[i].toCharArray();
            for (int j = 0; j< temp.length; j++){
                if (Character.isDigit(temp[j])){
                    if(flag){
                        tempnumber += temp[j] + "";
                        if (j+1<temp.length){
                            if (!Character.isDigit(temp[j+1])){
                                flag = false;
                            }
                        }
                    }
                    else{
                        temptail += temp[j] + "";
                    }
                }
                else{
                    if (flag){
                        temphead += temp[j] + "";
                    }
                    else{
                        temptail += temp[j] + "";
                    }
                }
            }
            array.add(new FileT(temphead, Integer.parseInt(tempnumber), temptail, i, files[i]));
        }
        
        Collections.sort(array);
        String[] answer = new String[array.size()];
        int index = 0;
        for (FileT f : array){
            answer[index++] = f.Name;
        }
        return answer;
    }
    
    class FileT implements Comparable<FileT> {
        String Heads;
        int Numbers;
        String Tails;
        int index;
        String Name;
        
        public FileT(String Heads, int Numbers, String Tails, int index, String Name){
            this.Heads = Heads;
            this.Numbers = Numbers;
            this.Tails = Tails;
            this.index = index;
            this.Name = Name;
        }
        
        @Override
        public int compareTo(FileT p) {
            int check = this.Heads.compareToIgnoreCase(p.Heads);
            if(check>0) {
                return 1; 
            }
            else if(check == 0) {
                if(this.Numbers > p.Numbers) { 
                    return 1;
                }
                else if (this.Numbers == p.Numbers){
                    if(this.index > p.index) { 
                        return 1;
                    }
                }
            }
            return -1;
        }
    }
}