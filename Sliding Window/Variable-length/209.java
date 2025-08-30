//MINIMUM SUBARRAY LENGTH 
// USED VARIABLE LENGTH APPROACH AS NO OF SUBARRAY LENGTH IS NOT SPECIFIED 






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