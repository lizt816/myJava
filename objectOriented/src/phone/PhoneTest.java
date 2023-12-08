package phone;
/**
 * ClassName: P.PhoneTest
 * Package: PACKAGE_NAME
 * Description:
 * @author: Lizt0816
 * @Create 2023/11/20 15:10
 * @version: 1.0
*/

public class PhoneTest {
    public static void main(String[] args) {
        MyPhone p1 = new MyPhone();
        System.out.println(p1.name);
        p1.call();
        p1.price = 100;
        System.out.println(p1.price+"1");
        p1.priceAdd();
        System.out.println(p1.price+"2");
        p1.fun(1,2,4,8,7,5);

        String a = "12";
        String b = a;
        a = "22";
        System.out.println(b);
    }
}
