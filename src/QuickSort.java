/**
 * @Author: xuzifan
 * @Date: 2024/1/17 - 01 - 17 - 22:49
 * @Description: PACKAGE_NAME
 * @version: 1.0
 */
public class QuickSort {
    public static void sort(int[]arr){
        quickSort(arr,0,arr.length-1);
    }

    private static void quickSort(int[] a, int start, int end) {
        if (start < end) {
            int base = a[start];
            int left = start;
            int right = end;
            while (left < right) {
                while (left < right && a[right] >= base) {
                    right--;
                }
                a[left] = a[right];
                while (left < right && a[left] <= base) {
                    left++;
                }
                a[right] = a[left];
            }
            a[left] = base;
            quickSort(a, start, left - 1);
            quickSort(a, left + 1, end);
        }
    }
}
