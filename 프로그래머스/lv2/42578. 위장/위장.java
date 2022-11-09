import java.util.HashMap;
import java.util.Iterator;

class Solution {
    public int solution(String[][] clothes) {
        int answer = 1;
		HashMap<String, Integer> map = new HashMap<String, Integer>();
		
		for (String[] cc : clothes) {
				if(!map.containsKey(cc[1])) {
					map.put(cc[1], 0);
				}
				map.replace(cc[1], map.get(cc[1])+1);	
		}
		
		Iterator<String> iter = map.keySet().iterator(); 
		int index = 0;
        while(iter.hasNext()) {
            String key = iter.next();
            Integer value = (Integer) map.get(key);
            answer *= (1+value);
        }
        
        return answer-1;
        
    }
}