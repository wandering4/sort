/**
 * @Author: xuzifan
 * @Date: 2024/1/17 - 01 - 17 - 22:23
 * @Description: PACKAGE_NAME
 * @version: 1.0
 */
public class InsertionSort {
    public static void sort(int[]arr){
        int n=arr.length;
        if(n<2){
            return;
        }
        for (int i = 1; i < n; i++) {
            for (int j = i; j >=1&&arr[j-1]>=arr[j] ; j--) {
                //swap
                arr[j-1]=arr[j-1]^arr[j];
                arr[j]=arr[j-1]^arr[j];
                arr[j-1]=arr[j-1]^arr[j];
            }
        }
    }
}
