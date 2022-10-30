class Solution {
    public String solution(int[] numbers, String hand) {
        String answer = "";
        int[][] location = {{1,3},{0,0},{1,0},{2,0},{0,1},{1,1},{2,1},{0,2},{1,2},{2,2}};
        int[] lefthand = {0,3};
        int[] righthand = {2,3};
        int lefttemp = 0;
        int righttemp = 0;
        
        for (int n : numbers){
            switch (n){
                    case 1 : case 4: case 7:
                        lefthand = location[n];
                        answer += "L";
                        break;
                    case 3 : case 6: case 9:
                        righthand = location[n];
                        answer += "R";
                        break;
                    default :
                        lefttemp = Math.abs((lefthand[0] - location[n][0])) + Math.abs((lefthand[1] - location[n][1]));
                        righttemp = Math.abs((righthand[0] - location[n][0])) + Math.abs((righthand[1] - location[n][1]));
                        if (lefttemp == righttemp){
                            if (hand.equals("left")){
                               answer += "L";
                               lefthand = location[n];
                            }
                            else{
                                answer += "R";
                                righthand = location[n];
                            }
                        }
                        else if (lefttemp > righttemp){
                            answer += "R";
                            righthand = location[n];
                        }
                        else{
                            answer += "L";
                            lefthand = location[n];
                        }
                }
        }
        
        return answer;
                    
    }
}