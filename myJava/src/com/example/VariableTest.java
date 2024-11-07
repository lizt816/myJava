package com.example;

class VariableTest {
 public static void main(String[] args){

/*
*** 命名规范
** 包名：多单词组成时，所有单词的首字母都小写
** 接口名：多单词组成首字母都是大写
** 变量名：多单词组成时首字母小写，后续组成单词首字母大写
** 产量名：所有字母都是大写，多当成用下划线隔开DSA_DAS
  *** 定义变量： 
  ** 中文如果不能被javac MyJava.java  这样识别，就使用其他命令：
    * javac -encoding UTF-8 HelloWrold.java
** 基本数据类型：8种
 整型：byte \ short \ int \ long
 浮点型：float \ doubl
 字符型：char
 布尔型：boolean

** 引用数据类型：
 类（ class ）
 数组 （ array ）
 接口 （ interface ）
 枚举 （ enum ）
 注解 （ annotation ）
 记录 （ record ）

   次方就是2*n次方次；
 * byte age = 127； byte( 字节 ) 的最大值是127 
   * 占位：1byte = 8bit位，-128 ~ 127
 * short myShort = 12 最大值为 -2的15次方 ~ 2的15次方-1    
   * 1short = 2字节   8bit * 2字节 = 16位
 * int age = 12;  最大值为 -2的31次方 ~ 2的31次方-1 ( 约21亿 )  
   * 1int = 4字节 ； 8bit * 4字节 = 32位
 * long myLong = 12；最大值为 -2的63次方 ~ 2的63次方-1     
   * 1long =8字节 ； 8bit * 8字节 = 64位
   在声明long变量时，值要求在末尾添加大写或者小写的L
** 他们的关系为：
  * 8bit = 1byte
  * 1024byte = 1KB
  * 1024KB = 1MB
  * 1024MB = 1GB
  * 1024GB = 1TB

 * char gender = '男'; // 性别 char 字符串类型的变量
* int // 数字类型
* char // 定义单个字符串的类型
* float // 定义浮点类型
* boolean // 布尔类型
* 
*/   

  // 测试浮点的精度：
  // System.out.println(0.1+0.2);


  // 练习：定义圆周率并赋值为3.14，现在有3个半径分别为1.2,2.5,6，求他们的面积。
  double pi = 3.14;
  double radius1 = 1.2;
  double radius2 = 2.5;
  int radius3 = 6;
  // 计算面积
  double area1 = pi * radius1 * radius1;
  double area2 = pi * radius2 * radius2;
  double area3 = pi * radius3 * radius3;
  // System.out.println(area1);
  // System.out.println(area2);
  // System.out.println(area3);


  // 练习二  将华氏温度转换为摄氏度，并以华氏度和摄氏度为单位分别显示该温度
  // 公式： 温度 = ( 华氏温度 - 32 ) / 1.8
  double hua = 80.0;
  // 摄氏度：
  // System.out.println((hua - 32) / 1.8);

  // 布尔类型boolean  不能使用 !0 来判断
  if(true){
   // System.out.println((hua - 32) / 1.8);
  }

  // 自动类型提升
  int s = 10;
  int ss = 10;
  int sss = s+ss;
  // System.out.println(sss);


  // 隐式类型转换:
  double d1 = 12;    // 自动类型转换
  int i1 = (int)d1;  // 强制类型转换

  // System.out.println(i1);

  int i2 = 128;
  byte b2 = (byte)i2; // 这个时候打印是  -128
  // System.out.println(b2);


  long l1 = 12;
  // method((int)l1);

  short ssssss = 12;
  ssssss = (short)(ssssss - 2);

  // System.out.println("sss"+s);

  // 字符串类型

  String str9 = "20";
  int myInt = Integer.parseInt(str9);
  // System.out.println(myInt+10);

  // 练习：
  // 定义: 姓名  年龄  性别  体重  婚姻  联系方式

  String name = "涛哥";
  int age = 24;
  char gender = '男';
  double weight = 123.5;
  boolean isMarried = false;
  String phoneNumbe = "13012341234";



  int x = 5;
  int xs = 12;
  // System.out.println( xs % x );  // 模运算 取余数


  int ajj = 0;
  int abb = ajj++;
  // System.out.println( abb );  // 值为0

  int a=10,b=20;

  String mySss = "111";

  mySss = a > b?"222":"333";
  
  // System.out.println(mySss);
 }

 public static void exchangeValue(int a,int b){
  
 }

 // 案例一个方法
  public static void method(int num){  // 自动变量提升
   System.out.println("11"+num);
  }
}
