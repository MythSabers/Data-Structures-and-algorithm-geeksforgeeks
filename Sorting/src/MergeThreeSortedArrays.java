import java.util.ArrayList;
import java.util.Arrays;

class MergeThreeSortedArraysSolution {

    // using 2 pointer approach on array a and array b
    // then again using them on temp and c
    public ArrayList<Integer> mergeThree(int[] a, int[] b, int[] c) {
        // code here
        int[] temp = new int[a.length + b.length];
        int p1 = 0;
        int p2 = 0;
        int i = 0;
        mergeTwoArray(a, b, temp, p1, p2, i);


        int[] arr = new int[temp.length + c.length];
        p1 = 0;
        p2 = 0;
        i = 0;
        mergeTwoArray(temp, c, arr, p1, p2, i);
        ArrayList<Integer> list = new ArrayList<>();
        for (int ele : arr)
            list.add(ele);
        return list;

    }

    private void mergeTwoArray(int[] a, int[] b, int[] temp, int p1, int p2, int i) {
        while (p1 < a.length && p2 < b.length) {
            if (a[p1] < b[p2]) {
                temp[i++] = a[p1++];
            } else if (a[p1] > b[p2]) {
                temp[i++] = b[p2++];
            } else {
                temp[i++] = a[p1++];
                temp[i++] = b[p2++];
            }
        }
        while (p1 < a.length) {
            temp[i++] = a[p1++];
        }

        while (p2 < b.length) {
            temp[i++] = b[p2++];
        }
    }


}


public class MergeThreeSortedArrays {
    public static void main(String[] args) {
        int a[] = {1, 2, 3, 4};
        int b[] = {1, 2, 3, 5};
        int c[] = {1, 2, 3, 4, 5, 6};

        new MergeThreeSortedArraysSolution().mergeThree(a, b, c);
    }
}

// 1,1,1,2,2,2,3,3,3,4,4,4,3,3
// [1, 1, 1, 2, 2, 2, 3, 3, 3, 4, 4, 5, 5, 6