package April2026;

import java.util.Arrays;

public class Lab22Apr_Practice1 {
    public static void main(String[] args) {
        int[] numbers = {10, 20, 30, 40, 50};
        System.out.println("Elements at even positions in the array:");
        int[] rotatedArray= rotateArray(numbers);
        System.out.println(Arrays.toString(rotatedArray));
    }
    public static int[] rotateArray(int[] arr)
    {
        int[] rotated = new int[arr.length];
        for (int i = 0; i < arr.length; i++) {
            rotated[i] = arr[(i + 1) % arr.length];
        }
        return rotated;
    }
}
