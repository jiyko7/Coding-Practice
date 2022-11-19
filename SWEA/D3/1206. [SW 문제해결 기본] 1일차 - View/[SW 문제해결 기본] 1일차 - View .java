
import java.util.Scanner;
import java.io.FileInputStream;
import java.util.Arrays;

class Solution
{
	public static void main(String args[]) throws Exception
	{
		
		Scanner sc = new Scanner(System.in);
		
		for(int test_case = 1; test_case <= 10; test_case++)
    		{
                int building1 = 0;
                int building2 = 0;
                int building3 = 0;
                int building4 = 0;
                int building5 = 0;
                
                int[] arr = {0,0,0,0,0};
                
                int N=sc.nextInt();
     
                int count = 0;
                
                int[] height = {0,0,0};
                for (int i = 0; i<N; i++){
                	building1 = building2;
                	building2 = building3;
                	building3 = building4;
                	building4 = building5;
                	building5 = sc.nextInt();
    
                	if (building3>building1 && building3>building2  && building3>building4 && building3>building5) {
                		arr[0] = building1;
                    	arr[1] = building2;
                    	arr[2] = building3;
                    	arr[3] = building4;
                    	arr[4] = building5;
                		Arrays.sort(arr);
                		
                		count += (arr[4] - arr[3]);
                	}

                }
                
                if (building4>building2 && building4>building3  && building4>building5) {
            		arr[0] = 0;
                	arr[1] = building2;
                	arr[2] = building3;
                	arr[3] = building4;
                	arr[4] = building5;
            		Arrays.sort(arr);
            		
            		count += (arr[4] - arr[3]);
                }
                
                if (building5>building3 && building5>building4) {
            		arr[0] = 0;
                	arr[1] = 0;
                	arr[2] = building3;
                	arr[3] = building4;
                	arr[4] = building5;
            		Arrays.sort(arr);
            		
            		count += (arr[4] - arr[3]);
            		
            	}
                
                System.out.println("#" + test_case + " " + count);
                

    		}
	}
}
