class Solution {
  public int[] solution(int[] arr) {
      if(arr.length == 1){
          int[] answer = {-1};
          return answer;
      }

      int[] answer = new int[arr.length-1];
      int minIndex=0;

      for(int i=0;i<arr.length;i++){
          if(arr[minIndex]>arr[i]){
              minIndex = i;
          }
      }
      System.out.println(minIndex);
      for(int i=minIndex+1;i<arr.length;i++){
          arr[i-1] = arr[i];
          System.out.println(i);
          System.out.println(arr);
          
      }
      for(int i=0;i<answer.length;i++){
          answer[i] = arr[i];
      }
      return answer;
  }
}