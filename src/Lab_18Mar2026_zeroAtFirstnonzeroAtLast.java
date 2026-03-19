public class Lab_18Mar2026_zeroAtFirstnonzeroAtLast {
    public static void main(String[] args) {
        int[] arr = {0, 1, 0, 3, 12};
        int nonZeroIndex = 0; // Index to place the next non-zero element

        // Move non-zero elements to the front
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] != 0) {
                arr[nonZeroIndex] = arr[i];
                nonZeroIndex++;
            }
        }
        // Fill the remaining elements with zero
        for (int i = nonZeroIndex; i < arr.length; i++) {
            arr[i] = 0;
        }

        // Print the modified array
        System.out.print("Modified array: ");
        for (int num : arr) {
            System.out.print(num + " ");
        }
    }
}
