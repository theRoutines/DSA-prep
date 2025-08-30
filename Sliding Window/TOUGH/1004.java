//MAXIMUM CONSEQUTIVE 1's
class Solution {
    public int longestOnes(int[] nums, int k) {
        int left = 0;          // left side of sliding window
        int zeroCount = 0;     // how many zeros are in the current window
        int maxLen = 0;        // answer: longest window length
        
        for (int right = 0; right < nums.length; right++) {
            // Step 1: Expand window by including nums[right]
            if (nums[right] == 0) {
                zeroCount++;
            }
            
            // Step 2: If too many zeros, shrink window from left
            while (zeroCount > k) {
                if (nums[left] == 0) {
                    zeroCount--;
                }
                left++;
            }
            
            // Step 3: Update max length of valid window
            maxLen = Math.max(maxLen, right - left + 1);
        }
        
        return maxLen;
    }
}
