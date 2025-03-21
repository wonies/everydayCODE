package study;

class Sol8 {
	public int solution(int n) {
		int [] dp = new int [n+1];
		if (n==0) return 0;
		if (n==1) return 1;
		dp[0] = 0;
		dp[1] = 1;
		dp[2] = 1;

		for (int i=3 ; i<=n; i++)
		{
			dp[i] = (dp[i-1] + dp[i-2]) % 1234567;
		}
		return dp[n];
	}
}
