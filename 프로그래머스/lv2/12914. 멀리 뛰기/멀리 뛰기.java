class Solution {
    public long solution(int n) {
        long answer = 1;
        int [] arr = new int [n+1];
        if (n == 1)
            return 1;
        else if (n == 2)
            return 2;
        else{
            arr[1] = 1;
            arr[2] = 2;
            for (int i =3; i<=n; i++){
                arr[i] = arr[i-2]% 1234567 + arr[i-1]% 1234567;
            } 
            return arr[n] % 1234567;
        }
    }
}