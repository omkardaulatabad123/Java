import java.util.Scanner;

public class Sorttt{

    // Selection Sort
    static void selectionSort(double A[]) {
        int n = A.length;
        for (int i = 0; i < n - 1; i++) {
            int minIndex = i;
            for (int j = i + 1; j < n; j++) {
                if (A[j] < A[minIndex]) {
                    minIndex = j;
                }
            }
            // swap
            double temp = A[minIndex];
            A[minIndex] = A[i];
            A[i] = temp;
        }
    }

    // Bubble Sort
    static void bubbleSort(double A[]) {
        for (int i = 0; i<A.length; i++) {
            for (int j = 0; j < A.length - i - 1; j++) {
                if (A[j] > A[j + 1]) {
                    double temp = A[j];
                    A[j] = A[j + 1];
                    A[j + 1] = temp;
                }
            }
        }
    }

    // Display array
    static void display(double A[]) {
        for (double val : A) 
        {
            System.out.print(val + "  ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number of employees: ");
        int n = sc.nextInt();

        double salaries[] = new double[n];
        System.out.println("Enter salaries of employees:");
        for (int i = 0; i < n; i++) {
            salaries[i] = sc.nextDouble();
        }

        // Create copies so both sorts can use original data
        double selectionSorted[] = salaries.clone();
        double bubbleSorted[] = salaries.clone();

        // Selection Sort
        selectionSort(selectionSorted);
        System.out.println("\nSalaries sorted using Selection Sort:");
        display(selectionSorted);

        // Bubble Sort
        bubbleSort(bubbleSorted);
        System.out.println("\nSalaries sorted using Bubble Sort:");
        display(bubbleSorted);

        sc.close();
    }
}
