import java.util.Arrays;

class InsertionSortSolution {

    public void insertionSort(int[] arr) {
        for (int i = 1; i < arr.length; i++) {
            int key = arr[i];
            int j = i - 1;
            while (j >= 0 && arr[j] >= key) {
                arr[j + 1] = arr[j];
                j = j - 1;
            }
            arr[j + 1] = key;
        }
    }

}


public class InsertionSort {
    public static void main(String[] args) {
        int[] arr = {4, 1, 3, 9, 7};
        new InsertionSortSolution().insertionSort(arr);
        Arrays.stream(arr).mapToObj(String::valueOf).reduce((i, j) -> i + "," + j).ifPresent(System.out::println);

    }
}
