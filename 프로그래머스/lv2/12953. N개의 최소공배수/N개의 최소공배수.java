import java.util.*;
class Solution {
    public int solution(int[] arr) {
        int answer = 0;
        Arrays.sort(arr);
        int Index = arr[arr.length-1];
        int a = 0;
        while (true){
            for (a = 0; a<arr.length; a++){
                if (Index%arr[a]!=0){
                    break;
                }
            }
            if (a == arr.length){
                return Index;
            }
            Index++;
        }
    }
}