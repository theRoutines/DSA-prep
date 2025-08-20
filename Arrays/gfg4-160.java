//MEDIUM LEVEL QUESTION
//I GOT IT WRITE JUST WAS TAKING A LONGER TURN TO AND USE d = d%n 
//ROTATE ARRAY TOWARDS LEFT

class Solution {

    static void rotateArr(int arr[], int d) {
        int n = arr.length;
        int k = 0;int j = 0;
        d = d%n;
        int[] arr1 = new int[n];
        
            for(int i = 0;i<d;i++)
            {
                arr1[i] = arr[i];
            }
            for(int i=d;i<n;i++)
            {
                arr[k++] = arr[i];
            }
            while(k<n)
            {
                arr[k++] = arr1[j++];
            }
        
        // System.out.print(Arrays.toString(arr));
    }
}