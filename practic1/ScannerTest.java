
/*
  * 如何从键盘获取到不同类型 如：基本数据类型，String类型 的变量：使用Scanner类
  * 1. 使用Scanner获取不同类型数据的步骤
  * 2. 提供（ 或创建 ） 一个Scanner类的实例
  * 3. 调用Scanner类中的方法，获取指定类型的变量
  * 4. 关闭资源，调用Scanner类的close()方法

  * 案例：
  * import java.util.Scanner;  // 导入Scanner，在java.util下的包都需使用import先导入
  * 1. 获取到用户输入的类型：
  *   * 获取到字符串 ： String name = scanner.next();
  *   * 获取到整数int类型 ：int age = scanner.nextInt();
  *   * 获取到浮点double类型 ： double weight = scanner.nextDouble();
  *   * 获取到布尔boolean类型 ： boolean isSingle = scanner.nextBoolean();
  *   * 获取到布尔boolean类型 ： boolean isSingle = scanner.nextBoolean();
  *   * 获取到char类型不能获取，只能用其他方法： char gender = scan.next().charAt(0);  获取字符串的第一个下标
  *   * Scanner只能获取到 byte、short、int、long、float、double、boolean、String 类型变量的方法;
  */
import java.util.InputMismatchException;
import java.util.NoSuchElementException;
import java.util.Scanner;

class ScannerTest {
 public static void main(String[] args) {
  Scanner scanner = new Scanner(System.in);
  System.out.println("请输入姓名为");
  String name = scanner.next();
  callback(name, scanner);
  System.out.println("请输入年龄");
  callbackInt(scanner);
  System.out.println("哇塞");
  scanner.close();
 }

 public static void callback(String name, Scanner scanner) {
  System.out.println("你输入的名字为: " + name);
  if (name.equals("涛哥") || name != "") {
   System.out.println("ok!");
  } else {
   System.out.println("no!");
   String names = scanner.next();
   callback(names, scanner);
  }
 }

 public static void callbackInt(Scanner scanner) {
  // 无限循环while (true)，使用break可以跳出循环，
  // 如果执行到了catch后使用System.err.println("输入的年龄不是有效的整数，请重新输入: ");
  // 进行提示然后在继续try
  while (true) {
   try {
    int age = scanner.nextInt();
    System.out.println("你输入的年龄为: " + age);
    System.out.println("ok!");
    break; // 输入正确，跳出循环
   } catch (InputMismatchException e) {
    System.err.println("输入的年龄不是有效的整数，请重新输入: ");
    scanner.next(); // 清除输入缓冲区
   }
  }

   // 使用递归的写法
   // try {
   //  int age = scanner.nextInt();
   //  System.out.println("你输入的年龄为: " + age);
   //  System.out.println("ok!");
   // } catch (InputMismatchException e) {
   //     scanner.next();   // 清除输入的缓存区
   //     System.err.println("输入的年龄不是有效的整数: " + e.getMessage());
   //     callbackInt(scanner);
   // }
 }
}
