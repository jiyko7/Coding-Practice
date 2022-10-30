import java.util.*;

class Solution {
    public int[] solution(int[] answers) {
        ArrayList<Integer> A = new ArrayList<>();
        int[] check = new int[3];
        int max = 0;
        
        int[] s1 = {1,2,3,4,5};
        int[] s2 = {2,1,2,3,2,4,2,5};
        int[] s3 = {3,3,1,1,2,2,4,4,5,5};
        
        int Index = 0;
        for (int i : answers){
            check[0] += i==s1[Index%s1.length]? 1:0;
            check[1] += i==s2[Index%s2.length]? 1:0;
            check[2] += i==s3[Index%s3.length]? 1:0;
            Index++;
            
            System.out.println(check[0]);
            System.out.println(check[1]);
            System.out.println(check[2]);
        }
        
        for (int c : check){
            max = max<c? c: max;
        }
        
        for (int j=0; j<3; j++){
            if (check[j]==max)
                A.add(j);
        }
        
        int[] answer = new int[A.size()];
        Index = 0;
        for (int a : A){
            answer[Index++] = a+1;
        }

        return answer;
    }
}