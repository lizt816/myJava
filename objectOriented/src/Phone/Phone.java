package Phone;

/**
 * ClassName: P.Phone
 * Package: PACKAGE_NAME
 * Description: 手机
 *
 * @author: Lizt0816
 * @Create 2023/11/20 15:10
 * @version: 1.0
 */
public class Phone {
    String name;  //
    double price; //

    public void call(){
        System.out.println("正在拨打的话....");
    }

    public void sendMessage(String message){
        System.out.println("发送信息"+message);
    }
    public void sendMessage(int message){
        System.out.println("发送信息"+message);
    }

    public void playGame(){
        System.out.println("手机可以玩游戏");
    }

    public void priceAdd(){
        price++;
    }
}
