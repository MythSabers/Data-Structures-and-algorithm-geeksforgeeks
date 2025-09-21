import java.util.Arrays;

class BubbleSortSolution {
    public void bubbleSort(int[] arr) {
        // code here
        for (int i = 0; i < arr.length; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[i] > arr[j]) {
                    int temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                }
            }
        }
    }
}


public class BubbleSort {
    public static void main(String[] args) {
        int[] arr = {10, 9, 8, 7, 6, 5, 4, 3, 2, 1};
        new BubbleSortSolution().bubbleSort(arr);
        Arrays.stream(arr).mapToObj(String::valueOf).reduce((i,j) -> i + "," + j).ifPresent(System.out::println);
    }
}
