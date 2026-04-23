package April2026;

import java.util.Arrays;

public class Lab22Apr_rotatearray
{
    public static void main(String[] args)
    {
        int[] input = {1, 2, 3, 4, 5};
        int k = 2; // Number of positions to rotate
        System.out.println("Original array:"+Arrays.toString(input));
        rotateArray(input, k);

        System.out.println("Rotated array:"+ Arrays.toString(input));
        for (int n:input)
        {
            System.out.print(n+" ");
        }
    }
    public static void rotateArray(int[] input, int k)
    {
        int n = input.length;

        reverse(input,0,n-1);
        reverse(input,0,k-1);
        reverse(input,k,n-1);
    }
    public static void reverse(int[] arr, int start, int end) {
        while (start < end)
        {
            int temp = arr[start];
            arr[start] = arr[end];
            arr[end] = temp;
            start++;
            end--;
        }
    }
}
