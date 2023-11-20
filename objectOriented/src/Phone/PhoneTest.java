package Phone;

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
        Phone p1 = new Phone();
        System.out.println(p1.name);
        p1.call();
        p1.price = 100;
        System.out.println(p1.price+"1");
        p1.priceAdd();
        System.out.println(p1.price+"2");
    }
}
