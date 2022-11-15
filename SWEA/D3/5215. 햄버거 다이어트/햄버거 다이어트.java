/////////////////////////////////////////////////////////////////////////////////////////////
// 기본 제공코드는 임의 수정해도 관계 없습니다. 단, 입출력 포맷 주의
// 아래 표준 입출력 예제 필요시 참고하세요.
// 표준 입력 예제
// int a;
// double b;
// char g;
// String var;
// long AB;
// a = sc.nextInt();                           // int 변수 1개 입력받는 예제
// b = sc.nextDouble();                        // double 변수 1개 입력받는 예제
// g = sc.nextByte();                          // char 변수 1개 입력받는 예제
// var = sc.next();                            // 문자열 1개 입력받는 예제
// AB = sc.nextLong();                         // long 변수 1개 입력받는 예제
/////////////////////////////////////////////////////////////////////////////////////////////
// 표준 출력 예제
// int a = 0;                            
// double b = 1.0;               
// char g = &apos;b&apos;;
// String var = &quot;ABCDEFG&quot;;
// long AB = 12345678901234567L;
//System.out.println(a);                       // int 변수 1개 출력하는 예제
//System.out.println(b); 		       						 // double 변수 1개 출력하는 예제
//System.out.println(g);		       						 // char 변수 1개 출력하는 예제
//System.out.println(var);		       				   // 문자열 1개 출력하는 예제
//System.out.println(AB);		       				     // long 변수 1개 출력하는 예제
/////////////////////////////////////////////////////////////////////////////////////////////
import java.util.Scanner;
import java.io.FileInputStream;

/*
   사용하는 클래스명이 Solution 이어야 하므로, 가급적 Solution.java 를 사용할 것을 권장합니다.
   이러한 상황에서도 동일하게 java Solution 명령으로 프로그램을 수행해볼 수 있습니다.
 */
class Solution
{
    static int max = 0;
    static int limit = 0;
	public static void main(String args[]) throws Exception
	{
	
        
		Scanner sc = new Scanner(System.in);
		int T;
		T=sc.nextInt();
		/*
		   여러 개의 테스트 케이스가 주어지므로, 각각을 처리합니다.
		*/

		
		for(int test_case = 1; test_case <= T; test_case++)
		{
            max = 0;
            int count = sc.nextInt();
            limit = sc.nextInt();
            
            int[] number = new int[count];
        	int[] calorie = new int[count];
        	int[] taste = new int[count];
            boolean[] visited = new boolean[count];
            
            for (int i = 0; i<count; i++){
                number[i] = i;
                taste[i] = sc.nextInt();
                calorie[i] = sc.nextInt();
            }
            
            
            for (int j = 1; j<=count; j++){
           		comb(number, taste, calorie, visited,0,count,j);
            }
            
            System.out.println("#" +test_case + " " + max);
		}
	}
    static void comb(int[] number, int[] taste, int[] calorie, boolean[] visited, int depth, int n, int r){
        if (r == 0){
            int sumCal = 0;
            int sumTaste = 0;
            for (int i = 0; i<n; i++){
                if (visited[i]){
                	sumCal += calorie[i];
                	sumTaste += taste[i];
                }
            }
            if (sumCal <= limit && sumTaste>=max){
                max = sumTaste;
            }
            return;
        }
        
        if (depth ==n){
            return;
        }
        
        visited[depth] = true;
        comb(number, taste, calorie, visited, depth+1,n,r-1);
        
        visited[depth] = false;
        comb(number, taste, calorie, visited, depth+1,n,r);
        
    }
}