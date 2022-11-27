import java.util.Collections;
import java.util.Stack;

class Solution {
    public String solution(String X, String Y) {
        StringBuilder answer = new StringBuilder();
        
        int[] xnum = new int[10];
		int[] ynum = new int[10];
		int[] num = new int[10];
		
		for (int i = 0; i<X.length(); i++) {
			xnum[check(X.charAt(i))]++;
		}
		
		for (int j = 0; j<Y.length(); j++) {
			ynum[check(Y.charAt(j))]++;
		}
		
        boolean none = false;
		for (int k = 9; k>=0; k--) {
			if (xnum[k]>ynum[k]) {
                for (int m = 0; m<ynum[k];m++) {
				    answer.append(k);
                    none =true;
			    }	
			}
			else {
				for (int m = 0; m<xnum[k];m++) {
				    answer.append(k);
                    none = true;
			    }
			}
		}
		
        if (!none){
            return "-1";
        }
        else if (answer.toString().startsWith("0")){
            return "0";
        }
		return answer.toString();
    }
    
    static int check(char c) {
		switch (c) {
			case '0':
				return 0;
			case '1':
				return 1;
			case '2':
				return 2;
			case '3':
				return 3;
			case '4':
				return 4;
			case '5':
				return 5;
			case '6':
				return 6;
			case '7':
				return 7;
			case '8':
				return 8;
			case '9':
				return 9;	
		}
		return -1;
	}
    
}