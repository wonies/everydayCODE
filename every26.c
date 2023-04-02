//백준 2839 | 설탕배달

#include <stdio.h>
#define min(a, b) a < b ? a : b
int dp[5001];

int main()
{
    int n;
    scanf("%d", &n);

    dp[3] = 1;
    dp[5] = 1;
    for (int i=6; i<=n; i++)
    {
        if (i % 5 == 0)
            dp[i] = dp[i-5] + 1;
        else if (i % 3 ==0)
            dp[i] = dp[i-3] + 1;
        else if (dp[i-3] != 0 && dp[i-5] != 0)
            dp[i] = min(dp[i-3], dp[i-5]) + 1;
    }
    if (dp[n] == 0)
        printf("-1\n");
    else
        printf("%d\n", dp[n]);
}