import java.util.Arrays;

class ThreeWayPartitioningSolution {
    public void threeWayPartition(int[] arr, int a, int b) {
        // can just use sorting to solve, however have to use three pointer
        // either of these are fine
        // code here
        int l = 0;
        int r = arr.length - 1;
        for (int i = 0; i <= r; ) {
            if (arr[i] < a) {
                swap(arr, i, l);
                l++;
                i++;
            } else if (arr[i] > b) {
                swap(arr, i, r);
                r--;
            } else {
                i++;
            }
        }
    }
    private void swap(int[] arr, int i, int r) {
        int temp = arr[i];
        arr[i] = arr[r];
        arr[r] = temp;
    }
}


public class ThreeWayPartitioning {
    public static void main(String[] args) {
        int[] arr = {1, 4, 3, 6, 2, 1};
        int a = 1, b = 3;
        new ThreeWayPartitioningSolution().threeWayPartition(arr, a, b);
        Arrays.stream(arr).mapToObj(String::valueOf).reduce((i,j) -> i + "," + j).ifPresent(System.out::println);
    }
}
