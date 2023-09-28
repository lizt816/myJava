/*
  * 生成随机数：
  * 获取0-1之间的浮点数
  * double doubleRandomRandom = Math.random();
  * 
  * 获取0-100之间的整数：
  * int intRandom = (int)(Math.random() * 101);
  *
  * 获取1-100之间的整数：
  * int intRandom = (int)(Math.random() * 100) + 1;
  *
  * 获取a - b之间的随机整数：
  * int intRandom = (int)(Math.random() * ( b - a + 1 )) + a;
  */

import java.util.Scanner;

class ReandomTest {
  public static void main(String[] args){
   // 生成随机数
   double doubleRandom = Math.random();  // 返回0-1之间的值
   System.out.println("哇塞"+doubleRandom);


   int intRandom = (int)(Math.random() * 100) + 1;
   System.out.println("哇塞"+intRandom);

   callbackInt();

   // 获取a到b之间的随机整数
   int a = 10;
   int b = 12;
   int ab = (int)(Math.random() * ( b - a + 1 )) + a;
   System.out.println("哇abab塞"+ab);
  }

  public static void callbackInt(){
    // 获取到100才停止
   int intRandom = (int)(Math.random() * 100) + 1;
   if(intRandom == 100){
     System.out.println("哇塞卧槽"+intRandom);
   }else{
    callbackInt();
   }
  }
}
