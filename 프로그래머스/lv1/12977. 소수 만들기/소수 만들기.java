

class Solution {
    public int solution(int[] nums) {
        int answer = 0;
        boolean[] visited = new boolean[nums.length];
        
        int N = 3000;
        boolean[] prime = new boolean[N+1];
        
        prime[0] = prime[1] = true;
        for(int i=2; i*i<=N; i++){
            if(!prime[i]){
            	for(int j=i*i; j<=N; j+=i) prime[j]=true;                
            }        
        }    
        
        for (int a = 0; a<nums.length; a++)
            for (int b = a+1; b<nums.length; b++)
                for (int c = b+1; c<nums.length; c++){
                    if (!prime[nums[a]+nums[b]+nums[c]])
                        answer++;
                }
        return answer;
    }
}
        