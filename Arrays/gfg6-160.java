//MAJORITY ELEMENT - APPEARS MORE THAN N/3 TIMES
//APPROACHED USINNG HASHMAP TO COUNT THE FREQ OF ELEMENT AND THEN USING MAP.ENTRY ITERATOR TO CHECK FOR N/3 CONDITION
// TO REDUCE SPACE COMPLEXITY, USE BAYER MOORE METHOD TO GET 0(1)


class Solution {
    public ArrayList<Integer> findMajority(int[] arr) {
        // Code here
        int n = arr.length;
        int end = n/3;
        ArrayList<Integer> list = new ArrayList<>();
        HashMap<Integer,Integer> map = new HashMap<>();
        for(int i:arr)
        {
            map.put(i,map.getOrDefault(i,0)+1);
        }
        for(Map.Entry<Integer,Integer> entry: map.entrySet())
        {
            if(entry.getValue() > end)
            {
                list.add(entry.getKey());
            }
        }
        if(list.isEmpty())
        {
            return list;
        }
        else
        {
            Collections.sort(list);
            return list;
        }
    }
}





//BAYER MOORE
import java.util.*;

class Solution {
    public ArrayList<Integer> findMajority(int[] arr) {
        int n = arr.length;

        // Step 1: Find potential candidates
        int candidate1 = 0, candidate2 = 0;
        int count1 = 0, count2 = 0;

        for (int num : arr) {
            if (num == candidate1) {
                count1++;
            } else if (num == candidate2) {
                count2++;
            } else if (count1 == 0) {
                candidate1 = num;
                count1 = 1;
            } else if (count2 == 0) {
                candidate2 = num;
                count2 = 1;
            } else {
                count1--;
                count2--;
            }
        }

        // Step 2: Verify actual counts
        count1 = 0;
        count2 = 0;
        for (int num : arr) {
            if (num == candidate1) count1++;
            else if (num == candidate2) count2++;
        }

        // Step 3: Collect valid results
        ArrayList<Integer> result = new ArrayList<>();
        if (count1 > n / 3) result.add(candidate1);
        if (count2 > n / 3) result.add(candidate2);

        if (result.isEmpty()) {
            result.add(-1);
        } else {
            Collections.sort(result); // max 2 elements, O(1)
        }

        return result;
    }
}
