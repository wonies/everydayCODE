import sys
sys.stdin = open("input.txt", "rt")

n, k = map(int, input().split())

cnt = 0
for i in range(1, n + 1):
    if (n % 2 == 0):
        cnt+=1
        if (cnt == k):
            print(i)