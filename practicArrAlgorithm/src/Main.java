/**
 * ClassName: 算法
 * Package:
 * Description: 数组中常见的算法
 *
 * @author: Lizt0816
 * @Create 2023/11/20 11:14
 * @version: 1.0
 */
public class Main {
    public static void main(String[] args) {
//        数组求最大值
        int[] arr = new int[]{1,5,9,4,1,2,0,1,4,8,7};
        int max = arr[1];
        for (int i = 0; i < arr.length; i++) {
            if(max < arr[i]){
                max = arr[i];
            }
        }
        System.out.println("最大值为："+max);
//       求总和
        int sum = 0;
        for (int i = 0; i < arr.length; i++) {
            sum+=arr[i];
        }
        System.out.println("总和值为："+sum);
        //    求平均值
        int avgValue = sum/arr.length;
        System.out.println("总和值为："+avgValue);



    }
}
