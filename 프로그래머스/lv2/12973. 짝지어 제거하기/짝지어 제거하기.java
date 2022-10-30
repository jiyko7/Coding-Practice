import java.util.Stack;

class Solution
{
    public int solution(String s)
    {
        char[] array= s.toCharArray();;
    	Stack<String> stackA = new Stack<>();
        Stack<String> stackB = new Stack<>();
        String tempa;
        String tempb;
        for (int i = array.length-1; i>=0;i--) {
            stackA.push(String.valueOf(array[i]));
        }
        while(true) {
            if(stackA.isEmpty()) {
            	break;
            }
            if(stackB.isEmpty()) {
            	stackB.push(stackA.pop());
            	continue;
            }
            tempa = stackA.pop();
            tempb = stackB.pop();
            if (!tempa.equals(tempb)) {
            	stackB.push(tempb);
            	stackB.push(tempa);
            }
        }
        if (stackB.isEmpty()) {
        	return 1;
        }
        return 0;
    }
}