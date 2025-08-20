//MEDIUM LEVEL LEETCODE QUESTION
// ROTATE ARRAY TOWARDS RIGHT BY K SPACES
// DONE THIS QUESTION USING SPACE OF O(1) - 0ms

class Solution
{
    void rotate(int[] nums, int k)
    {
        int n = nums.length;
        k = k%n;
        reverse(nums, 0, n-1);  //REVERSE ENTIRE ARRAY   7,6,5,4,3,2,1
        reverse(nums, 0, d-1);  //REVERSE THE PART WHICH IS REQUIRED TO BE AT THE STARTING  5,6,7,4,3,2,1
        reverse(nums, d, n-1);  // 5,6,7,1,2,3,4

    }
    void reverse(int[] nums, int start, int end)
    {
        while(start<end)
        {
            int temp = nums[start];
            arr[start] = arr[end];
            arr[end] = temp;
            start++;
            end--;
        }
    }
}