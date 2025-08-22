//SINGLE NUMBER
//FINDING OUT A NUMBER WHOSE FREQ IS JUST 1 IN LINEAR TIME AND CONSTANT SPACE

class Solution {
    public int singleNumber(int[] nums) {
        HashMap<Integer, Integer> map = new HashMap<>();
        int result = 0;
        
        for(int i:nums)
        {
            map.put(i,map.getOrDefault(i,0)+1);
        }
        for(Map.Entry<Integer,Integer> entry : map.entrySet())
        {
            if(entry.getValue()==1)
            {
                result = entry.getKey();
            }
        }
        return result;
    }
}