if (vowels.contains(s.charAt(i))) { count++; }
-->s.charAt(i) is the new character entering the window (the rightmost one).
-->If it’s a vowel, increment the count because the new window has one extra vowel.

if (vowels.contains(s.charAt(i - k))) { count--; }
-->s.charAt(i-k) is the old character leaving the window (the leftmost one).
-->If it was a vowel, decrement the count because it no longer belongs to the window. 

//1456. Maximum Number of Vowels in a Substring of Given Length 


class Solution {
    public int maxVowels(String s, int k) {
        int n = s.length();
        
        int count = 0;
        for(int i=0;i<k;i++)
        {
            if(s.charAt(i)=='a' || s.charAt(i)=='e' || s.charAt(i)=='i' || s.charAt(i)=='o' || s.charAt(i)=='u')
            {
                count++;
            }
        }
        int max = count;
        for(int i=k;i<n;i++)
        {
            if(s.charAt(i)=='a' || s.charAt(i)=='e' || s.charAt(i)=='i' || s.charAt(i)=='o' || s.charAt(i)=='u')
            {
                count++;
            }
            if(s.charAt(i-k)=='a' || s.charAt(i-k)=='e' || s.charAt(i-k)=='i' || s.charAt(i-k)=='o' || s.charAt(i-k)=='u')
            {
                count--;
            }
            max = Math.max(max,count);
        }
        return max;
    }
} 



QUICK OPTIMIZATION :- use this to avoid writing big lines for comparing vowels :
            java.util.Set<Character> vowels = 
            new java.util.HashSet<>(java.util.Arrays.asList('a','e','i','o','u'));

        // First window
        for (int i = 0; i < k; i++) {
            if (vowels.contains(s.charAt(i))) {
                count++;
            }
        }