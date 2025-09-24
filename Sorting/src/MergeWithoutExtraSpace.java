import java.util.Arrays;

class MergeWithoutExtraSpaceSolution {
    public void mergeArrays(int a[], int b[]) {
        // code here
        int i = a.length - 1;
        int j = 0;
        while (i >= 0 && j < b.length) {
            if (a[i] > b[j]) {
                int temp = a[i];
                a[i] = b[j];
                b[j] = temp;
                i--;
            }
            j++;
        }
        Arrays.sort(a);
        Arrays.sort(b);


    }
}


public class MergeWithoutExtraSpace {
    public static void main(String[] args) {
        int[] a = {1, 3, 5, 7};
        int[] b = {0, 2, 6, 8, 9};

        new MergeWithoutExtraSpaceSolution().mergeArrays(a, b);

        Arrays.stream(a).mapToObj(String::valueOf).reduce((i, j) -> i + "," + j).ifPresent(System.out::println);
        Arrays.stream(b).mapToObj(String::valueOf).reduce((i, j) -> i + "," + j).ifPresent(System.out::println);
    }
}
