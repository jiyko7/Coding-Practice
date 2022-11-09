import java.util.ArrayList;

class Solution {
    public int solution(String str1, String str2) {
        ArrayList<String> str1array = new ArrayList<String>();
		ArrayList<String> str2array = new ArrayList<String>();
		ArrayList<String> kyoarray = new ArrayList<String>();
		
		for (int  i = 0; i<str1.length()-1;i++) {
			char temp1 = Character.toUpperCase(str1.charAt(i));
			char temp2 = Character.toUpperCase(str1.charAt(i+1));
			if ((temp1 >= 'A' && temp1 <= 'Z') && (temp2 >= 'A' && temp2 <= 'Z')) {
				str1array.add(temp1+""+temp2);
			}
		}
		int hapsize = str1array.size();
		
		for (int  i = 0; i<str2.length()-1;i++) {
			char temp1 = Character.toUpperCase(str2.charAt(i));
			char temp2 = Character.toUpperCase(str2.charAt(i+1));
			if ((temp1 >= 'A' && temp1 <= 'Z') && (temp2 >= 'A' && temp2 <= 'Z')) {
				int loc = str1array.indexOf(temp1+""+temp2);
				if(loc != -1) {
					str1array.remove(loc);
					kyoarray.add(temp1+""+temp2);
				}
				else {
					str2array.add(temp1+""+temp2);
				}
			}
		}
        
		hapsize += str2array.size();
        int kyosize = kyoarray.size();
        
        if (hapsize == kyosize){
            return 65536;
        }
        
        double temp = (double)kyosize/hapsize;
        int answer = (int)(temp*65536);
        return answer;
    }
}