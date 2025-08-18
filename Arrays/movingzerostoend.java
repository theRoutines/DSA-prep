//GFG EASY
//O(n)
//made changes in the same array itself, took a new variable denoting the index of the array and started replacing the characters of the array. 
class Solution {
    void pushZerosToEnd(int[] arr) {
        int n = arr.length;
        int k = 0;
        for(int i=0;i<n;i++)
        {
            if(arr[i]!=0)
            {
                arr[k++] = arr[i];
            }
        }
        while(k<n)
        {
            arr[k++] = 0;
        }
        
        System.out.print(Arrays.toString(arr));     //Prints array in [_,_,_,] format
        
    }
}