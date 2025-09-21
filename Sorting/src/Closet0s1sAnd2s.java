import java.util.Arrays;

class Closet0s1sAnd2sSolution {
    // The function should do the stated modifications in the given array arr[]
    // Do not return anything.

    // arr[]: Input Array
    // N: Size of the Array arr[]
    // Function to segregate 0s, 1s and 2s in sorted increasing order.
    public static void segragate012(int arr[], int N) {
        // Your Code Here
        int z = 0;
        int o = 0;
        int t = 0;

        for (int i : arr) {
            if (i == 1)
                o++;
            if (i == 2)
                t++;
            if (i == 0)
                z++;
        }

        for (int i = 0; i < N; i++) {
            if (i < z)
                arr[i] = 0;
            else if (i < z + o)
                arr[i] = 1;
            else
                arr[i] = 2;
        }
    }
}


public class Closet0s1sAnd2s {
    public static void main(String[] args) {
        int[] arr = {0, 2, 1, 2, 0};

        Closet0s1sAnd2sSolution.segragate012(arr, arr.length);
        Arrays.stream(arr).mapToObj(String::valueOf).reduce((i,j) -> i + "," + j).ifPresent(System.out::println);
    }
}
