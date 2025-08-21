//INTERSECTION OF TWO ARRAYS :- 
// USING HASHSET, COPYING THE FIRST ARRAY THEN USING .contains METHOD TO CHECK FOR ITS AVAILABILITY IN ARRAY 2


// User function Template for Java
class Solution {

    // Function to find the intersection of two arrays
    ArrayList<Integer> intersection(int[] a, int[] b) {
        HashSet<Integer> set = new HashSet<>();
        ArrayList<Integer> arr = new ArrayList<>();
        for(int i:a)
        {
            set.add(i);
        }
        for(int i:b)
        {
            if(set.contains(i))
            {
                arr.add(i);
                set.remove(i);
            }
        }
        return arr;
        
    }
}