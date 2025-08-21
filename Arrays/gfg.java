//UNION OF ARRAY WITH DUPLICATES
// Three Appoaches - 1)Uisng HashMap 
                    //  2)Using TreeSet
                    //  3) Using two pointers


class Solution {
    public static ArrayList<Integer> findUnion(int[] a, int[] b) {
        TreeSet<Integer> tree = new TreeSet<>();
        ArrayList<Integer> arr = new ArrayList<>();
        for(int i:a)
        {
            tree.add(i);
        }
        for(int i:b)
        {
            tree.add(i);
        }
        arr.addAll(tree);
        return arr;
    }
}