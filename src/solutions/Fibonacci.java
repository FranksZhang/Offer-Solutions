package solutions;

public class Fibonacci {
	
	//时间复杂度为O(n)
	public int SolveFibonacci(int n) {
		int[] result = {0,1};
        if(n < 2)
            return result[n];
		
        int fibOne = 0;
        int fibTwo = 1;
        int fibResult = 0;
        for(int i = 2; i <= n; i++) {
        	fibResult = fibOne + fibTwo;
        	fibOne = fibTwo;
        	fibTwo = fibResult;
        }
        return fibResult;
    }
	
}
