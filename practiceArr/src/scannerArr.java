import java.util.Scanner;

/**
 * ClassName: scannerArr
 * Package: PACKAGE_NAME
 * Description:
 *
 * @author: Lizt0816
 * @Create 2023/10/26 17:42
 * @version: 1.0
 */
public class scannerArr {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int s = scanner.nextInt();
        System.out.println("sss"+s);
        int[] arr = new int[s];

        for (int i = 0; i < arr.length; i++) {
            arr[i] = scanner.nextInt();
        }
        for (int j : arr) {
            System.out.println("arr--" + j);
        }
    }
}
