//FIND THE MISSING NUMBER 
// MY APPROACH - USING ARRAYLIST (O(mxn^2))
                //  USING HASHSET (O(N)) , (O(N))
                //  USING SUM TECHNIQUE (O(N)), O(1)


//MY APPROACH
class Solution {
    public int missingNumber(int[] nums) {
        int n = nums.length;
        int missing = 0;
        ArrayList<Integer> arr = new ArrayList<>();

        for(int i:nums)
        {
            arr.add(i);
        }
        for(int i=1;i<=n;i++)
        {
            if(!arr.contains(i))
            {
                missing = i;
                break;
            }
        }
        if(missing==0)
        {
            return 0;
        }
        else
        {
            return missing;
        }
        
    }
}


//MOST OPTIMIZED APPROACH
class Solution {
    public int missingNumber(int[] nums) {
        int n = nums.length;
        int expectedSum = n * (n + 1) / 2;
        int actualSum = 0;
        
        for (int num : nums) {
            actualSum += num;
        }
        
        return expectedSum - actualSum;
    }
}
