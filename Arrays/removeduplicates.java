//REMOVE DUPLICATES FROM SORTED ARRYA
//LEETCODE EASY 26
//Two ways to do it:
//1) Hashset(Linked Hashset as it preserves order) or Two-pointer = O(n)
//2) TreeSet - o(n logn)

//USING TREESET(my approach) - Because hashset stores random unique elements but treeset stores in order unique elements

class Solution {
    public int removeDuplicates(int[] nums) {
        int n = nums.length;
        int k = 0;
        Set<Integer> set = new TreeSet<>();
        for(int i=0;i<n;i++)
        {
            set.add(nums[i]);
        }
        for(int i:set)
        {
            nums[k++] = i;
        }
        Integer[] arr = set.toArray(new Integer[0]);
        return arr.length;


    }
}








//NOW USING TWO-POINTER 

public int removeDuplicates(int[] nums) {
        if (nums.length == 0) return 0;

        int i = 0; // slow pointer (tracks unique elements)
        for (int j = 1; j < nums.length; j++) { // fast pointer
            if (nums[j] != nums[i]) { 
                i++;
                nums[i] = nums[j]; // place unique element
            }
        }
        return i + 1; // length of unique elements
    }




//USING LINKED HASH SET APPROACH 

class Solution {
    public int removeDuplicates(int[] nums) {
        Set<Integer> set = new LinkedHashSet<>(); // preserves order

        for (int num : nums) {
            set.add(num);
        }

        int i = 0;
        for (int val : set) {
            nums[i++] = val;
        }

        return set.size();
    }
    