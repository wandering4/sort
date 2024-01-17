/**
 * @Author: xuzifan
 * @Date: 2024/1/17 - 01 - 17 - 22:05
 * @Description: PACKAGE_NAME
 * @version: 1.0
 */
public class BubbleSort {
    public static void sort(int[]arr){
        int n=arr.length;
        if(n<2){
            return;
        }
        for (int i = 0; i < n-1; i++) {
            for (int j = 0; j <n-1; j++) {
                if(arr[j]>arr[j+1]) {
                    int temp=arr[j];
                    arr[j]=arr[j+1];
                    arr[j+1]=temp;
                }
            }
        }
    }
}
