import java.util.*;

class Solution {
    public int solution(int[][] board, int[] moves) {
        int answer = 0;
        Stack<Integer> stack = new Stack<>();
        for (int m : moves){
            m = m-1;
            for (int[] b : board){
                    if (b[m] != 0){
                        System.out.println(b[m]);
                        if (!stack.empty()){
                            if (stack.peek() == b[m]){
                                System.out.println("pop");
                                stack.pop();
                                answer++;
                                b[m] = 0;
                                break;
                            }
                        }
                        stack.push(b[m]);
                        b[m] = 0;
                        break;
                    }
            }
        }
        return 2* answer;
    }
}