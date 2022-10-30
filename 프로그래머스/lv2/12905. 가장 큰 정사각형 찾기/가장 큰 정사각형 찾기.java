class Solution
{
    public int solution(int [][]board)
    {
        int answer = 0;
        int width = board.length; 
        int height = board[0].length; 
       
        
        for (int i = 1; i<width; i++){
            for (int j = 1; j<height; j++){
                if (board[i][j] != 0){
                    board[i][j] += Math.min(Math.min(board[i][j-1],board[i-1][j-1]),board[i-1][j]);
                }
            }
        }
        
        for (int i = 0; i<width; i++){
            for (int j = 0; j<height; j++){
                answer = Math.max(answer, board[i][j]);
            }
        }

        return answer*answer;
    }
}