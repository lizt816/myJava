package com.example;  // 创建一个名为com.example的命名空间，防止重命名。
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
import java.util.InputMismatchException;  // 引入可输入框的包
import java.util.Scanner;                 // 引入可输入框的包

public class ScannerTest {
 public ScannerTest(String str) {
  System.out.println(str);
  Scanner scanner = new Scanner(System.in);
  System.out.println("请输入姓名：");
  callback("", scanner);
  System.out.println("请输入年龄");
  callbackInt(scanner);
  System.out.println("结束"); //
  scanner.close();   // 输入结束
 }

  void callback(String name, Scanner scanner) {
  System.out.println("请输入 ' Mr.Li ': " + name);
  if (name.equals("Mr.Li")) {
   System.out.println("哇塞,通过!");
  } else {
   if(!name.isEmpty()){
     System.out.println("输入错误!");
   }
   String names = scanner.next();
   callback(names, scanner);
  }
 }

 void callbackInt(Scanner scanner) {
  // 无限循环while (true)，使用break可以跳出循环，
  // 如果执行到了catch后使用System.err.println("输入的年龄不是有效的整数，请重新输入: ");
  // 进行提示然后在继续try
  while (true) {
   try {
    int age = scanner.nextInt();  // 在InputMismatchException中会监听输入的值是否为整数,不为整数则提示异常
    System.out.println("你输入的年龄为: " + age);
    break; // 输入正确，跳出循环
   } catch (InputMismatchException e) {
//    InputMismatchException : 异常数据的类型
    System.err.println("输入的年龄不是有效的整数，请重新输入: ");
    scanner.next(); // 清除输入缓冲区
   }
  }
 }
}
