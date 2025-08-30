//MAXIMUM AVERGAE SUBARRAY 
// EASY
// 

class Solution {
    public double findMaxAverage(int[] nums, int k) {
        double sum = 0;
        int n = nums.length;
        for(int i=0;i<k;i++)
        {
            sum += nums[i];
        }
        double max = sum;
        for(int i=k;i<n;i++)
        {
            sum += nums[i] - nums[i-k];
            max = Math.max(max,sum);

        }
        return max/k;
    }
}