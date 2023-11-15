/**
 * ClassName: ${NAME}
 * Package:
 * Description:
 *
 * @author: Lizt0816
 * @Create 2023/10/18 9:25
 * @version: 1.0
 */
public class Main {
    public static void main(String[] args) {

//        声明浮点
        double[] proces = new double[]{12.0,18.1,99,1234.55};
        for (int i = 0; i < proces.length; i++) {
 System.out.println("proces="+proces[i]);
        }

//        声明数字
        int[] arr = {12,45,12};
        for (int i = 0; i < arr.length; i++) {
            System.out.println("int="+arr[i]);
        }

//        声明字符串
        String[] foods = {"张三","李四"};
        for (int i = 0; i < foods.length; i++) {
            System.out.println("String="+foods[i]);
        }


//        栈和堆
    int[] arrs = new int[3];

        arrs[0] = 10;
      int[] arr2 = arrs;
        arr2[0] = 20;
        System.out.println(arrs[0]+"arrr");

    }
}
