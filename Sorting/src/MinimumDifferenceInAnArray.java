import java.util.Arrays;

class MinimumDifferenceInAnArraySolution {
    public int MinimumDifference(int[] arr) {
        // code here
        if (arr.length <= 1)
            return -1;
        Arrays.sort(arr);
        int min = Integer.MAX_VALUE;
        for (int i = 1; i < arr.length; i++) {
            int diff = arr[i] - arr[i - 1];
            min = Math.min(diff, min);
        }
        return min;
    }
}



public class MinimumDifferenceInAnArray {
    public static void main(String[] args) {
        int[] arr = {2, 4, 5, 9, 7};
        int minDiff = new MinimumDifferenceInAnArraySolution().MinimumDifference(arr);
        System.out.println(minDiff);
    }
}
