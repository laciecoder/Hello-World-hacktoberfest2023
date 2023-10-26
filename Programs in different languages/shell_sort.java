public class ShellSort {
    public static void shellSort(int[] arr) {
        int n = arr.length;

        // Start with a large gap and reduce it over time
        for (int gap = n / 2; gap > 0; gap /= 2) {
            // Perform an insertion sort for elements at the current gap
            for (int i = gap; i < n; i++) {
                int temp = arr[i];
                int j;
                for (j = i; j >= gap && arr[j - gap] > temp; j -= gap) {
                    arr[j] = arr[j - gap];
                }
                arr[j] = temp;
            }
        }
    }

    public static void main(String[] args) {
        int[] arr = {12, 11, 13, 5, 6};

        shellSort(arr);

        System.out.print("Sorted array: ");
        for (int value : arr) {
            System.out.print(value + " ");
        }
    }
}
