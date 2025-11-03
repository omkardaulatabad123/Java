import java.util.Scanner;

public class Searchingg 
{

    // Linear Search
    static int LinearSearch(int A[], int target) 
    {
        for (int i = 0; i < A.length; i++) 
        {
            if (A[i] == target) 
            {
                return i; // found
            }
        }
        return -1; // not found
    }

    // Bubble Sort
    static void BubbleSort(int A[]) 
    {
        int temp;
        for (int i = 0; i < A.length; i++) 
        {
            for (int j = i+1; j < A.length; j++) 
            {
                if (A[i] > A[j]) 
                {
                    temp = A[i];
                    A[i] = A[j];
                    A[j] = temp;
                }
            }
        }
    }

    // Binary Search
    static int BinarySearch(int A[], int left, int right, int x) 
    {
        while (left <= right) {
            int mid = (left + right) / 2;

            if (A[mid] == x)
                return mid;
            else if (A[mid] > x)
                right = mid - 1;
            else
                left = mid + 1;
        }
        return -1;
    }

    // Main function
    public static void main(String args[]) 
    {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number of Customer IDs: ");
        int size = sc.nextInt();

        int A[] = new int[size];
        System.out.println("Enter Customer IDs:");
        for (int i = 0; i < size; i++) 
        {
            A[i] = sc.nextInt();
        }

        System.out.print("Enter Customer ID to search: ");
        int target = sc.nextInt();

        // Linear Search
        int linearResult = LinearSearch(A, target);
        if (linearResult != -1)
            System.out.println("Linear Search: Customer ID found at position " + (linearResult + 1));
        else
            System.out.println("Linear Search: Customer ID not found.");

        // Sort the array before Binary Search
        BubbleSort(A);

        // Binary Search
        int binaryResult = BinarySearch(A, 0, A.length - 1, target);
        if (binaryResult != -1)
            System.out.println("Binary Search: Customer ID found at position " + (binaryResult + 1) + " (after sorting)");
        else
            System.out.println("Binary Search: Customer ID not found (after sorting).");

        sc.close();
    }
}
