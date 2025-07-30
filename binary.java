import java.util.Arrays;

public class binary {
    static int binary(int A[], int left, int right, int x) {
        int mid;
        while (left <= right) {
            mid = (left + right) / 2;

            if (A[mid] == x) {
                return mid;
            } else if (A[mid] > x) {
                right = mid - 1;
            } else {
                left = mid + 1;
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        int x = 11;
        int A[] = {12, 7, 3, 7, 8, 9, 0, 11, 21, 14};
        Arrays.sort(A); // Sort the array for binary search

        int n = A.length;
        int result = binary(A, 0, n - 1, x);

        if (result == -1) {
            System.out.println("Not found");
        } else {
            System.out.println("Found at index: " + result);
        }
    }
}
