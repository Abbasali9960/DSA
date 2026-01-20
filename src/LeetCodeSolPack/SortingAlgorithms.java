package LeetCodeSolPack;


import java.util.Arrays;

public class SortingAlgorithms {

    // ---------- Bubble Sort ----------
    public static void bubbleSort(int[] arr) {
        int n = arr.length;

        for (int i = 0; i < n - 1; i++) {
            boolean swapped = false;

            for (int j = 0; j < n - i - 1; j++) {
                if (arr[j] > arr[j + 1]) {
                    // swap arr[j] and arr[j+1]
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                    swapped = true;
                }
            }

            // If no two elements were swapped by inner loop, array is sorted
            if (!swapped) break;
        }
    }

    // ---------- Selection Sort ----------
    public static void selectionSort(int[] arr) {
        int n = arr.length;

        for (int i = 0; i < n - 1; i++) {
            int minIndex = i;

            // find index of minimum in the unsorted part
            for (int j = i + 1; j < n; j++) {
                if (arr[j] < arr[minIndex]) {
                    minIndex = j;
                }
            }

            // swap arr[i] with arr[minIndex]
            int temp = arr[i];
            arr[i] = arr[minIndex];
            arr[minIndex] = temp;
        }
    }

    // ---------- Insertion Sort ----------
    public static void insertionSort(int[] arr) {
        int n = arr.length;

        for (int i = 1; i < n; i++) {
            int key = arr[i];
            int j = i - 1;

            // Shift elements greater than key to one position ahead
            while (j >= 0 && arr[j] > key) {
                arr[j + 1] = arr[j];
                j--;
            }

            // place key at its correct position
            arr[j + 1] = key;
        }
    }

    // ---------- Utility: copy & run a sort without mutating original ----------
    private static int[] copy(int[] arr) {
        return Arrays.copyOf(arr, arr.length);
    }

    // ---------- Demo ----------
    public static void main(String[] args) {
        int[] data = {64, 25, 12, 22, 11, 5, 1, 4, 2, 8};

        int[] a1 = copy(data);
        bubbleSort(a1);
        System.out.println("Bubble Sort:    " + Arrays.toString(a1));

        int[] a2 = copy(data);
        selectionSort(a2);
        System.out.println("Selection Sort: " + Arrays.toString(a2));

        int[] a3 = copy(data);
        insertionSort(a3);
        System.out.println("Insertion Sort: " + Arrays.toString(a3));
    }
}
