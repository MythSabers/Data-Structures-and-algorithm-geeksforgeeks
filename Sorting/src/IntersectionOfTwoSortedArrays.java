import java.util.ArrayList;

class IntersectionOfTwoSortedArraysSolution {
    public ArrayList<Integer> intersection(int arr1[], int arr2[]) {
        // code here
        int i = 0;
        int j = 0;
        int n = arr1.length;
        int m = arr2.length;
        int last = 0;
        ArrayList<Integer> out = new ArrayList<>();
        while (i < n && j < m) {
            if (arr1[i] == arr2[j]) {
                if (last == arr1[i]) {
                    i++;
                    j++;
                    continue;
                }
                out.add(arr1[i]);
                last = arr1[i];
                i++;
                j++;
            } else if (arr1[i] > arr2[j]) {
                j++;
            } else {
                i++;
            }
        }
        return out;
    }
}


public class IntersectionOfTwoSortedArrays {
    public static void main(String[] args) {
        int[] arr1 = {1, 2};
        int[] arr2 = {3, 4};

        ArrayList<Integer> out = new IntersectionOfTwoSortedArraysSolution().intersection(arr1, arr2);
        System.out.println(out);
    }
}
