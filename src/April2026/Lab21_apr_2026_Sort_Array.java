package April2026;
public class Lab21_apr_2026_Sort_Array {
    public static void main(String[] args) {
        int[] arr = {5, 2, 8, 1, 4,67,65,34,23,45,76,92,90,19,4,6,8,10,12,11,0,3,9,7,15,14,13,17,16,18,20};
        for (int i = 0; i < arr.length - 1; i++) {
            for (int j = i+1; j < arr.length; j++) {
                if (arr[i] > arr[j]) {
                    int temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                }
            }
        }
        System.out.println("Sorted array in ascending order:");
        for (int num : arr) {
            System.out.print(num + " ");
        }
    }
}