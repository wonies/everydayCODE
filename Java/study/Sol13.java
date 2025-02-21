package study;

//프로그래머스: 멀리뛰기_edit

class Sol13 {
	public long solution(int n) {
		long answer = 0;
		int [] dp = new int [n+2];
		dp[0] = 0;
		dp[1] = 1;
		dp[2] = 2;
		if (n==1)
			return 1;
		if (n==2)
			return 2;
		for (int i=3; i<=n; i++)
		{
			dp[i] = (dp[i-1] + dp[i-2]) % 1234567;
		}
		return dp[n];
	}
}
