/**
 * 1. switch 的语法就是以下：
 * default就是以上都没结果的情况下
 * 
 * switch只能做相等的判断
 * 
 * switch的表达式中的类型，只能为：byte 、short 、char 、int、枚举、String
 * 
*/ 

class SwitchCaseTest {
 public static void main(String[] args) {
  int num = 5;
  switch (num) {
   case 0:
    System.out.println("哇塞" + num);
    break;
   case 1:
    System.out.println("哇塞" + num);
    break;
   default:
    System.out.println("哇塞" + num);
    break;
  }
 }
}
