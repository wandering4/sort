import java.util.Arrays;

/**
 * @Author: xuzifan
 * @Date: 2024/1/17 - 01 - 17 - 22:05
 * @Description: PACKAGE_NAME
 * @version: 1.0
 */
public class Test {
    //获得一个随机数组，长度为[0，maxlen],值为[0,maxval]
    public static int[] random(int maxlen, int maxval) {
        int len = (int) (Math.random() * (maxlen + 1));
        int[] arr = new int[len];
        for (int i = 0; i < len; i++) {
            arr[i] = (int) (Math.random() * (maxval + 1));
        }
        return arr;
    }
    //默认从小到大
    public static boolean isSorted(int[] a) {
        int n = a.length;
        if (n < 2) return true;
        int max = a[0];
        for (int i = 1; i < a.length; i++) {
            if (max > a[i]) return false;
            max = a[i];
        }
        return true;
    }
    //这是一个main方法程序的入口
    public static void main(String[] args) {
        int test = 1000;
        for (int i = 0; i < test; i++) {
            int[] arr = random(5, 20);
            BubbleSort.sort(arr);
            if (!isSorted(arr)) {
                for (i = 0; i < arr.length; i++) {
                    System.out.print(arr[i] + " ");
                }
                System.out.println();
                System.out.println("排序错了！");
            }
        }
    }
}
