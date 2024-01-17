/**
 * @Author: xuzifan
 * @Date: 2024/1/17 - 01 - 17 - 22:18
 * @Description: PACKAGE_NAME
 * @version: 1.0
 */
public class SelectionSort {
    public static void sort(int[]arr){
        int n=arr.length;
        if(n<2){
            return;
        }
        int minIndex=0;
        for (int i = 0; i < n-1; i++) {
            minIndex=i;
            for (int j = i+1; j <n ; j++) {
                minIndex=arr[minIndex]<arr[j]?minIndex:j;
            }
            if(i!=minIndex){
                int temp=arr[i];
                arr[i]=arr[minIndex];
                arr[minIndex]=temp;
            }
        }
    }
}
