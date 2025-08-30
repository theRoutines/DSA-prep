//FIND THE MAXIMUM SUBARRAY SUM
// YOU MIGHT THINK OF SOLVING IT WITH SLIDING WINDOW APPRAOCH, BUT FOR SLIDING WINDOW
//       -- there has to be a condition such as sum>=k, count >=k with Variable Window or When window size is fixed


class Solution {
    public int maxSubArray(int[] nums) {
        int n = nums.length;
        int sum = 0;
        int maxSum = Integer.MIN_VALUE;
        for(int i = 0 ;i<n;i++)
        {
            sum += nums[i];
            maxSum = Math.max(maxSum,sum);
            if(sum<0)
            {
                sum = 0;
            }

        }
        return maxSum;

    }
}