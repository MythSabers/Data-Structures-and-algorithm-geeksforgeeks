import java.util.Arrays;

class CountingSortSolution {
    public void sort(int[] arr, int n) {
        int k = 0;
        for (int i : arr)
            k = Math.max(k, i);

        int[] cntArr = new int[k + 1];
        for (int i = 0; i < n; i++) {
            cntArr[arr[i]]++;
        }

        // prefix sum
        for (int i = 1; i <= k; i++) {
            cntArr[i] = cntArr[i - 1] + cntArr[i];
        }

        int[] out = new int[n];
        for (int i = n - 1; i >= 0; i--) {
            out[cntArr[arr[i]] - 1] = arr[i];
            cntArr[arr[i]]--;
        }

        for (int i = 0; i < n;i++) {
            arr[i] = out[i];
        }
    }


    public static String countSort(String s) {
        // code here
        int[] freq = new int[26];
        char[] charArr = s.toCharArray();
        for (char c : charArr) {
            freq[c - 97]++;
        }

        String out = "";
        for (int i = 0; i < freq.length; i++) {
            char c = (char) (97 + i);
            int cnt = freq[i];
            while (cnt > 0) {
                out += c;
                cnt--;
            }
        }
        System.out.println(out);
        return out;
    }
}

public class CountingSort {
    public static void main(String[] args) {
//        int[] arr = {2, 5, 3, 0, 2, 3, 0, 3};
//        new CountingSortSolution().sort(arr, arr.length);
//
//        Arrays.stream(arr).mapToObj(String::valueOf).reduce((i,j) -> i + "," + j).ifPresent(System.out::println);

        String s = "geeksforgeeks";
        CountingSortSolution.countSort(s);

    }
}
