class Solution {
    public int[] solution(int[][] arr) {
        int[] answer = {0,0};
        int size = arr.length;
        
        
        quad(0,0,size,size,arr,answer);
        
        return answer;
    }
    
    static void quad(int i, int j , int isize, int jsize, int[][] arr, int [] answer) {
        int temp = arr[i][j];
        int k = i;
        int l = j;
       
        if (isize - i == 1 && jsize-j == 1){
            answer[temp]++;
            return;
        }


        for (k = i; k<isize; k++){
            for (l = j; l<jsize; l++){
                if (arr[k][l] != temp){
                    //System.out.println("1사분면");
                    quad(i,j,(isize-i)/2+i,(jsize-j)/2+j,arr,answer);
                    //System.out.println("2사분면");
                    quad(i,(jsize-j)/2+j,(isize-i)/2+i,jsize,arr,answer);
                    //System.out.println("3사분면");
                    quad((isize-i)/2+i,(jsize-j)/2+j,isize,jsize,arr,answer);
                    //System.out.println("4사분면");
                    quad((isize-i)/2+i,j,isize,(jsize-j)/2+j,arr,answer);
                    return;
                }

            }   
        }
        if (k == isize && l == jsize){
            answer[temp]++;
            return;
        }
    }
}