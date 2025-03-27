package programmers;

class Solution {
	public int[] solution(int[] sequence, int k) {
		int left = 0;
		int right = 0;
		int[] answer = {0, sequence.length - 1};
		int sum = sequence[0];

		while(right < sequence.length)
		{
			if (sum == k)
			{
				if (answer[1] - answer[0] > right - left)
				{
					answer[0] = left;
					answer[1] = right;
				}
				sum -= sequence[left];
				left++;
			}
			else if (sum > k)
			{
				sum -= sequence[left];
				left++;
			}
			else
			{
				right++;
				if (right < sequence.length) {
					sum += sequence[right];
				}
			}
		}

		return answer;
	}
}