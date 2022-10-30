import java.util.LinkedList;

class Solution {
    public int solution(int[] queue1, int[] queue2) {
        int answer = 0;
		long sum = 0;
		long sum1 = 0;
		long sum2 = 0;
        int count = 0;
		
		LinkedList<Integer> list1 = new LinkedList<Integer>();
		 for (int i1 : queue1) {
			 list1.add(i1);
			 sum += i1;
			 sum1 += i1;
             count++;  
		}
        count *= 3;
		
		LinkedList<Integer> list2 = new LinkedList<Integer>();
	    for (int i2 : queue2) {
			 list2.add(i2);
			 sum+=i2;
			 sum2+=i2;
		}
	    if (sum%2!=0)
	    	return -1;
        
	    while (true) {
            if (count == -1)
                return -1;
	    	if (sum1 == sum/2) {
	    		break;
	    	}
	    	else if (sum1>sum/2) {
                if(list1.isEmpty())
                    return -1;
	    		list2.addLast(list1.getFirst());
                sum2 += list2.getLast();
	    		sum1 -= list2.getLast();
	    		list1.removeFirst();
	    	}
	    	else {
                if(list2.isEmpty())
                    return -1;
	    		list1.addLast(list2.getFirst());
                sum1 += list1.getLast();
	    		sum2 -= list1.getLast();
	    		list2.removeFirst();
	    	}
	    	answer++;
            count--;
	    }
	    
	    return answer;
    }
}