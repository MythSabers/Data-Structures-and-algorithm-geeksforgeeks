import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.Set;

class UnionOfTwoSortedArraysSolution {
    public static ArrayList<Integer> findUnion(int a[], int b[]) {
        // code here
        Set<Integer> set = new HashSet<>();
        for (int i : a)
            set.add(i);
        for (int i : b)
            set.add(i);
        ArrayList<Integer> list = new ArrayList<>(set);
        Collections.sort(list);
        return list;

    }
}



public class UnionOfTwoSortedArrays {
    public static void main(String[] args) {
        int[] a = {2, 2, 3, 4, 5};
        int[] b = {1, 1, 2, 3, };

        ArrayList<Integer> list =
        UnionOfTwoSortedArraysSolution.findUnion(a, b);
        System.out.println(list);
    }
}
