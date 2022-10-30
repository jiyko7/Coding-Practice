class Solution {
    public String solution(String new_id) {
        String temp="";
        new_id = new_id.toLowerCase();
        //1단계
        for (int i = 0; i<new_id.length(); i++){
            if (Character.isLetterOrDigit(new_id.charAt(i)) || new_id.charAt(i) == '-' || new_id.charAt(i) == '_' ||  new_id.charAt(i) == '.'){
                temp += new_id.charAt(i);
            }
        }
        new_id = "";
        //2,3단계
        for (int j = 0; j<temp.length(); j++){
                if (temp.charAt(j) == '.'){
                    if (j == 0)
                        continue;
                    if (j == temp.length()-1)
                        break;
                    while (j<temp.length()-1 && temp.charAt(j) == '.' ){
                        j++;
                    }
                    new_id += ".";
                }
                if (temp.charAt(j) != '.')
                    new_id += temp.charAt(j);
        }

        //4,5단계
        if (new_id.length() != 0)
            if (new_id.charAt(0) == '.')
                new_id = new_id.substring(1);
        if (new_id.length() != 0)
            if (new_id.charAt(new_id.length()-1) == '.')
                    new_id = new_id.substring(0,new_id.length()-1);
        if (new_id.length() == 0)
            new_id += "a";

        
        if (new_id.length() >= 16){
            new_id = new_id.substring(0,15);
            if (new_id.charAt(14) == '.')
                new_id = new_id.substring(0,14);
        }

        //7단계
        if (new_id.length() <= 2){
            for (int l = new_id.length(); l<3; l++){
                new_id += new_id.charAt(l-1);
            }
        }
        
        return new_id;
    }
}