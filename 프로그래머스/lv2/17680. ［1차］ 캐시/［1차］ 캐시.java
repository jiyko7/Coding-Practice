import java.util.LinkedList;

class Solution {
    public int solution(int cacheSize, String[] cities) {
        int time = 0;
		boolean check = true;
		LinkedList<String> cache = new LinkedList<String>();
		
        if (cacheSize == 0)
            return cities.length*5;
		for (int i =0; i<cities.length; i++) {
            check = true;
			for (int j =0; j<cache.size(); j++) {
				if(cache.get(j).equalsIgnoreCase(cities[i])) {
					time += 1;
					cache.remove(j);
					cache.addLast(cities[i]);
					check= false;
					break;
				}
			}
			if(check) {
				if(cache.size()==cacheSize) {
					cache.remove(0);                    
				}
                time+=5;
				cache.addLast(cities[i]);
				
			}
		}
        return time;
	}
}