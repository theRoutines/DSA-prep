//FIND THE MAXIMUM SUBARRAY SUM
// YOU MIGHT THINK OF SOLVING IT WITH SLIDING WINDOW APPRAOCH, BUT FOR SLIDING WINDOW
//       -- there has to be a condition such as sum>=k, count >=k with Variable Window or When window size is fixed


class Solution {
    public int minSubArrayLen(int target, int[] nums) {
        ArrayList<Integer> seen = new ArrayList<>();
        int left = 0;
        int minLen = Integer.MAX_VALUE;
        int sum = 0;

        for(int right = 0; right<nums.length; right++)
        {
            sum = sum+nums[right];
            while(sum>=target)
            {
                minLen = Math.min(minLen, right-left+1);
                sum = sum-nums[left];
                left++;
            }
        }
        return (minLen == Integer.MAX_VALUE) ? 0: minLen;
    }
}