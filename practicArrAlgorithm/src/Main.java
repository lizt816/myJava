import java.util.*;

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


//        克隆数组
        int[] arr1 = new int[]{1,2,4,65};
        int[] arr2 = new int[arr1.length];

        for (int i = 0; i <arr1.length; i++) {
            arr2[i] = arr1[i]+1;
            System.out.println("新值："+arr1[i]);
        }


//        数组去重
        List<Integer> listWithDuplicates = new ArrayList<>();
        listWithDuplicates.add(1);
        listWithDuplicates.add(2);
        listWithDuplicates.add(3);
        listWithDuplicates.add(1);
        listWithDuplicates.add(4);
        listWithDuplicates.add(2);

        Set<Integer> setWithoutDuplicates = new HashSet<>(listWithDuplicates);

        List<Integer> listWithoutDuplicates = new ArrayList<>(setWithoutDuplicates);

        System.out.println("Original List: " + listWithDuplicates);
        System.out.println("List Without Duplicates: " + listWithoutDuplicates);

//        去重二
        int[] arrs = new int[]{1,5,7,8,4,7,4,5,6,9,5,2,1,4,2};
// 使用Set进行去重
        HashSet<Integer> set = new HashSet<>();
        for (int value : arrs) {
            set.add(value);
        }

        // 将去重后的元素放回新数组
        int[] arrsWithoutDuplicates = new int[set.size()];
        int index = 0;
        for (int value : set) {
            arrsWithoutDuplicates[index++] = value;
        }

        // 打印去重前后的数组
        System.out.println("Original Arraysss: " + Arrays.toString(arrs));
        System.out.println("Array Without Duplicatesssss: " + Arrays.toString(arrsWithoutDuplicates));



    }
}
