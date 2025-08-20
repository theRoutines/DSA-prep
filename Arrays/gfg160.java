//REVERSE AN ARRAY BUT MAKE CHANGES IN THE SAME ARRAY 
//Two ways :- Use arraylist and copy its elements in it and then reverse the elements and then copy the elements to the array again
//            (my approach) -   0(n), O(n)
//          2) More Optimal - use in place traversal for : 0(n), O(1)


//My Approach
class Solution {
    public void reverseArray(int arr[]) {
        List<Integer> list = new ArrayList<>();
        int k = 0;
        for(int i:arr)
        {
            list.add(i);
        }
        Collections.reverse(list);
        for(int i:list)
        {
            arr[k++] = i;
        }
    }
}


//Optimal Approach 
class Solution {
    public void reverseArray(int arr[]) {
        int left = 0, right = arr.length - 1;
        while (left < right) {
            int temp = arr[left];
            arr[left] = arr[right];
            arr[right] = temp;
            left++;
            right--;
        }
    }
}

