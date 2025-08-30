//FIXED - SIZED SLIDING WINDOW
public int maxSumSubarray(int[] arr, int k) {
    int n = arr.length;
    int windowSum = 0;
    for (int i = 0; i < k; i++) {
        windowSum += arr[i];
    }

    int maxSum = windowSum;

    for (int i = k; i < n; i++) {
        windowSum += arr[i] - arr[i - k];
        maxSum = Math.max(maxSum, windowSum);
    }

    return maxSum;
}


//VARIABLE SIZED SLIDING WINDOW 
public int smallestSubarrayWithSum(int[] arr, int K) {
    int left = 0, sum = 0, minLen = Integer.MAX_VALUE;

    for (int right = 0; right < arr.length; right++) {
        sum += arr[right];

        while (sum >= K) {
            minLen = Math.min(minLen, right - left + 1);
            sum -= arr[left];
            left++;
        }
    }

    return (minLen == Integer.MAX_VALUE) ? 0 : minLen;
}
 


// Sliding Window + HashMap

👉 Example: Longest substring without repeating characters

import java.util.*;

public int longestUniqueSubstring(String s) {
    Map<Character, Integer> seen = new HashMap<>();
    int left = 0, maxLen = 0;

    for (int right = 0; right < s.length(); right++) {
        char ch = s.charAt(right);

        if (seen.containsKey(ch) && seen.get(ch) >= left) {
            left = seen.get(ch) + 1;
        }

        seen.put(ch, right);
        maxLen = Math.max(maxLen, right - left + 1);
    }

    return maxLen;
}





// Prefix-sum + HashMap

👉 Example: Longest subarray with sum = K (works with positives + negatives)

import java.util.*;

public int longestSubarraySumK(int[] arr, int K) {
    Map<Integer, Integer> seen = new HashMap<>();
    seen.put(0, -1); // base case

    int prefixSum = 0, maxLen = 0;

    for (int i = 0; i < arr.length; i++) {
        prefixSum += arr[i];

        if (seen.containsKey(prefixSum - K)) {
            maxLen = Math.max(maxLen, i - seen.get(prefixSum - K));
        }

        seen.putIfAbsent(prefixSum, i);
    }

    return maxLen;
}
