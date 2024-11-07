学习java：
java -version：查看java版本号

DOS: WIN+R : cmd 
常用命令：
切换c盘： c：
切换d盘： d：
查看目录结构：dir
创建cccc文件夹：md cccc
删除cccc文件夹（需要空文件才行）：rd cccc
删除文件：del ccc.txt.
删除txt结尾的文件：del *.txt
进入指定目录： cd cccc 
进入指定目录： cd cccc/aaa/ddd
回退上级目录：cd ..
回退到根级：cd\
清除历史命令：cls

语言的发展史：
计算机语言：二进制
汇编语言：在指定的机器上编译
高级语言：return 7123+999

计算机语言排行榜，每个月发布一次：
https://www.tiobe.com/tiobe-index/

鄙视链：
c > c++ > java > c# > javascript > VB > python > php > all

java SE 标准版
· 支持桌面级应用，不过很少写这种了
java EE 企业版，主要的
· 服务端web开发
java ME 小型版
· 洛基亚手机上的小游戏



* 搭建java开发环境
什么是JDK , JRE
JDK: 是java程序开发工具包，包含JRE和开发人员使用的工具。
JRE: 是java程序的运行时环境，包含JVM和运行时所需的核心类库。 









JDK = JRE + 开发工具集 （ 比如Java编译工具等 ）
JRE = JVM + Java SE 标准类库

在选择版本方面，比较好的是Java 11 ，其次是Java 8，但是在Spring框架中，发布说需要把基准线调整到为17，学习还是已17 为准，17版本的趋势会越来越明显。

下载JDK
下载地址：https://docs.oracle.com/en/java/javase/index.html
网站地址：https://www.oracle.com
中文地址：https://www.oracle.com/cn/
java8：改变后面数字就是对应的版本
https://www.oracle.com/java/technologies/downloads/#java8

注意：安装的路径不能包含中文
在安装到指定的文件下后，认识一下安装的结构：
目录bin：
包含：JRE
包含开发工具：javac和java
目录include：
包含库的文件
目录jre：JVM + Java SE 标准类库
目录legal：法律条文的文件
目录lib：炸包啥的。
以上是根据java8的

** 配置path环境变量：
path环境变量： window操作系统执行命令时，所要搜寻的路径。
当需要执行或者说是打开一个文件时：需要在当前的文件夹内，但是需要定位到指定的文件夹内才能运行指定的java.exe
当配置了环境变量后，输入指定的指令还会在环境变量中查找
**配置path环境变量：
在电脑中找到高级系统设置，然后打开，有个弹窗，弹窗上有个高级，高级下有个环境变量，点进去，就会出现用户变量和系统变量，用户变量不用动它，在系统变量中的变量列找到Path，然后双击进去，然后新建，在点击新建后把路径放进去，需要让他放在最顶部，因为是从上往下执行的！！！！！
**推荐的配置环境变量方式
在点击Path那步暂停，不点击，先进行新增变量，在弹窗底下有个新建按钮，然后把java安装的路径复制一下，也就是bin的目录的上级目录。然后在新增变量的时候名称取名叫JAVA_HOWE,保存好后就会出现在系统变量上，这时候在打开Path，新增，叫%JAVA_HOWE%\bin 这样就行了，使用javac.exe看看行不行。
**以上是安装java8的步骤

***** 接下来就是安装java17
java17文档：https://docs.oracle.com/en/java/javase/17/index.html
安装步骤和java8没啥太大的区别，在安装好java17后，系统会自动生成环境变量，并且可能指向的c盘下的java，输入没安装到c盘上，但是c盘指定的文件夹会映射d盘，所以是一样的

接下来就是编写代码：
首先写个最简单的打印：helloworld
新增一个记事本，将后缀名改成.java，然后在写代码：
class HelloChina{
public static void main(String[] args){
System.out.println("hello world!!");
}}打印： System.out.println("hello world!!我爱中国")

打开终端，然后在当前文件夹内使用命令：
javac helloworld.java
当前文件夹下会生成HelloChina.class的文件
然后在运行命令：
java HelloChina
这时候就会打印hello world!! 

但是因为有中文的原因，所以会导致乱码
这个时候需要把文件重新保存：
打开记事本，然后在文件选项哪里有文件另存为，点击后会出现一个弹窗，然后在右下角有一个编码，点击选择ANSI,意思是美国国家标准，

这个时候就可以了，解释一下。
****点击命令行窗口，左上角的图标点击一下，查看属性，有一个当前代码页。，上面需要的是ANSI/OEM , 而记事本确是utf-8，所以在终端编码格式会对不上

***** 关于这段打印的解释：
class HelloChina{
public static void main(String[] args){
System.out.println("hello world!!");
}}在运行javac HellWorld.java时，会去找HellWorld.java这文件的所有class命令的类，执行后就会在同级目录下生成多个.class文件，处决于java文件内部的class类，这文件就叫字节码文件，然后需要使用命令去运行这个字节码文件，就会执行public static void main 内部的代码，如System.out.println("hello world!!");
就是打印：System.out.println打印的意思，打印hello world!!

*** 在其中：
关键字：class，表示类，
** main() 方法的写法是固定的。程序的入口：
1. public static void main(String[] args)
2. public static void main(String args[])
3. public static void main(String[] mag)
** 在控制台打印：System.out.println('换行的打印')
** 在控制台打印：System.out.println('不换行的打印')

** 在class对象中，如果想在class的前面使用public，需要遵循文件和class类同名的要求。 语法：
HelloJava.java文件内：
public class HelloJava {
}** java中的注释：
和js差不多：
// 单行注释
/*
多行注释
*/
文档注释
/**
@author 作者 
@version 1.0 版本
*/

** 使用javadoc生成文档：需要有一个public的class才能生成文档
文档注释可以使用javadoc生成对应的文档：
使用命令：
javadoc -d myjavadoc -author -version HelloWorld.java
myjavadoc： 文件名称
-author ： 作者
-version：版本
HelloWorld.java ： 被public的class方法


*** 下载api的文档：
在线看： https://docs.oracle.com/en/java/javase/17/docs/api/index.html
离线：https://www.oracle.com/java/technologies/javase-jdk17-doc-downloads.html


*** java的核心机制：JVM
JVM : 就相当于编译器，编译成对应的代码，一套代码，多端使用

内存溢出：超出本身可储存的空间
内存泄露：判断垃圾回收时，发现不是垃圾从而没用回收，就是泄露

** 换行和间隔符号
\n 换行
\t 间隔

****回顾学习java的学习内容：
** 第一阶段java基础：
* java概述，关键字，标识符，变量，运算符，流程控制（条件判断，选择结构， 循环结构），IDEA , 数组

** 第二阶段，java面向对象编程
> 类和类的内部成员
> 面向对象的三大特征
> 其他关键字的使用

** 第三阶段：Java语言的高级应用
> 处理异常，多线程，IO流，集合框架，反射，网络编程，新特性，其他api

java推荐书籍：《Java核心技术》 ，《Effective Java》，《Java编程思想》

** Java的主要使用场景：
* JavaEE后台开发，Android客户端开发

** JDK , JRE, JVM三者之间的关系，前面包含后面的
** 需要会设置环境变量


用于定义数据类型的关键字：
class - interface - enum - byte - short - int - long - float - double - char - boolean - void

用于定义流程控制的关键字：
if - else - switch - case - default - while - case - default - while - do - for - break - continue - return

用于定义访问权限修饰符的关键字：
private - protected - public

用于定义类，函数，变量修饰符的关键字：
abstract - final - static - synchronized

用于定义类与类之间关系的关键字：
extends - implements

用于定义建立实例及引用实例，判断实例的关键字：
new - this - super - instanceof

用于异常处理的关键字：
try - catch - finally - throw - throws

用于包的关键字：
packge - import 

其他修饰符关键字：
native - strictfp - transient - volatile - assert - const - goto

用于定义数据类型值的字面值：
this - false - null

*** Java中的标识符(identIfier)，也就是命名规则：
** 26个可大小写的英文字母和0-9数组加上_或者$符号组成。
** 不可以数字开头，不能包含空格

*** 命名规范
** 包名：多单词组成时，所有单词的首字母都小写
** 接口名：多单词组成首字母都是大写
** 变量名：多单词组成时首字母小写，后续组成单词首字母大写
** 产量名：所有字母都是大写，多当成用下划线隔开DSA_DAS

*** 定义变量： 
** 中文如果不能被javac MyJava.java 这样识别，就使用其他命令：
** javac -encoding UTF-8 HelloWrold.java
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

** 整型 次方就是2*n次方次；
* byte age = 127； byte( 字节 ) 的最大值是127 
* 占位：1byte = 8bit位，-128 ~ 127
* short myShort = 12 最大值为 -2的15次方 ~ 2的15次方-1 
* 1short = 2字节 8bit * 2字节 = 16位
* int age = 12; 最大值为 -2的31次方 ~ 2的31次方-1 ( 约21亿 ) 
* 1int = 4字节 ； 8bit * 4字节 = 32位
* long myLong = 12；最大值为 -2的63次方 ~ 2的63次方-1 
* 1long =8字节 ； 8bit * 8字节 = 64位

** 他们的关系为：
* 8bit = 1byte
* 1024byte = 1KB
* 1024KB = 1MB
* 1024MB = 1GB
* 1024GB = 1TB

** tips 
在声明long变量时，值要求在末尾添加大写或者小写的L
一般情况下都使用int 来声明整型数据。保险一些

** 浮点类型：
float 单精度 占用4字节
在使用float 声明变量时，值需要添加大写或者小写的f后缀
float f1 = 12.2f；
double 双精度 8 字节 常用
double f1 = 12.2；
一般情况下都使用double来声明浮点型数据。保险一些，float精度不搞
// 测试浮点的精度：
System.out.println(0.1+0.2); // 打印出0.30000...4
在不允许出现误差的领域，double 和 float 都不靠谱，需要使用BigDecimal类替换浮点型数据。

** 字符类型：
* char 两个字节
* char c1 = 'a'; // 只能存放一个字符

** Unicode：表示直接使用字符型常量：'\uXXXX'
转意字符：
\n 换行符 \u000a
\t 制表符 \u0009 
\" 双引号 \u0022 
\' 单引号 \u0027 
\\返斜线 \u005c
\b 退回符 \u0008
\r 回车符 \u000d
ASSCLL码：
char c11 = 97; // 打印出是a

boolean类型：只有两个值，true 和 false
// 布尔类型boolean 不能使用 !0 来判断 true 和false

*** 自动类型提升：
** 当两个存储值小于int类型的两个类型进行比较时，最低赋值需要给int类型：
如：short s = 10;
short ss = 10;
需要使用int来接收：
int sss = s+ss;
下面这样会编译失败
short sss = s+ss;
下面这种情况就可以没问题：因为最低要求就是int
int s = 10;
int ss = 10;
int sss = s+ss;

int i1 = 12;
float f1 = i1; // 这个时候会自动类型转换，就不需要加F了


** 解释一下：关于long 12 = 123L; // 为什么需要加L ,因为会自动提升类型，不加的话就变成了int类型
** 关于long 12 = 123; 不加的话现在就是int类型，如果这个值超出了int最大范围，就会出问题。

** float 一定要加f float myfloat = 1F;

** 为什么变量名不能数字开头，因为如果使用 1f为变量名，重新赋值的时候，就会冲突。

** java虚拟机，目前是最强大的虚拟机：
** JVM : 虚拟机
** javac：编译器

*** 强制类型转换：
double d1 = 12; 这里会类型自动转换，整数转换成浮点数，也就是12.0
强制类型转换就是将指定类型强行转换成其他类型
如：
double d1 = 12； // 12.0
int i1 = (int)d1; // 12 
使用强制类型转换可能会导致精度损失！！
以上情况会截断小数点后的数据

第二种情况精度损失：
int i1 = 128;
byte b1 = (byte)i1; // 这个时候打印是 -128 ，涉及到原理的问题

short ssssss = 12;
ssssss = (short)(ssssss - 2); // 需要强制类型转换 为 short才能正常编译,2是int类型

*** 字符串类型：String
字符串相当于多个char组成的。
字符串转数字：
String str9 = "20";
int myInt = Integer.parseInt(str9);
System.out.println(myInt+10); // 打印为30
当两个值进行对比的时候：
Syring ss = "11";
ss.equals("11"); // 这个对比是对内容进行对比，而不是对存储空间的值对比
如果使用ss == "11"; // 这种情况可能会不对，因为"11"可能不是当前存储空间的值

** 关于进制的说明和使用：
* 二进制（ binary ）
满二进一位，在java 中已 0b 或者 0B 开头
int num2 = 0b10; // 定义一个二进制 

* 十进制 （ decimal ）
0-9
满10进一位，就和日常的数字一样，容易被理解

* 十六进制 （ ）
0-9 加上a-f 组成 ，a-f不分大写或者小写
满16进一，在java中已0x或者0X开头表示，

二进制转成十进制：
https://www.bilibili.com/video/BV1PY411e7J6/?p=32&spm_id_from=333.880.my_history.page.click&vd_source=d4b3414b088e588bac096cd64acd6000

十进制转成二进制：
https://www.bilibili.com/video/BV1PY411e7J6/?p=33&spm_id_from=pageDriver&vd_source=d4b3414b088e588bac096cd64acd6000

为什么init的 128 等于 byte的 -128 ，原因：
https://www.bilibili.com/video/BV1PY411e7J6/?p=33&spm_id_from=pageDriver&vd_source=d4b3414b088e588bac096cd64acd6000

在java中：
*** +1 和 ++ 的区别 ：
** +1是　+int的1 
** ++的话就是在自己的基础上加1 
可以通过取余数获取小数点后面的数

** 关于++的问题，当一个值使用++时，那个值就会自己+1，当时如果需要马上赋值
* int a = 0；
* int b = a++；
* 打印 b 的值为 0，因为先赋值在++的

** 关于强制类型转换：
int i = 5;
long l = 10; // 自动类型转换为 int
byte b = i // 不会自动提升，需要强转为(byte)i; 如果有运算： (byte)(i +1)

** 声明变量： 
int a,b;
int a = 3,b = 4;
连续赋值： a = b = 10; 

** 关于+=的操作：
byte by1 = 10；
by1 += 5； // 没问题
by1 = by1 +1 ；// 异常，因为1是int类型，需要强转换 by1 = (byte)(by1 + 1)

** java中& 和 && 的区别 
区别就在于，使用 true && fun() ; 如果前面是true，那么才会执行到后面
int a = 0;
还有一个区别 if( false && a++ ) // 这个时候a还是等于0
使用一个&的话 if( false & a++ ) // 之后a还会执行一个++就等于1

** 关于Scanner函数，获取到键盘输入的值，在github的java练习1的ScannerTest.java内有说明

** java中获取随机数：
Math.random(); // 返回double值 ，所以需要使用double类型接收
double MyRandom = Math.random(); // 返回0-1之间的浮点值 
*** 在github的java练习中 ReandomTest.java 有相关的例子

** switch的语法：SwitchCaseTest.java 在这个练习中

** 关于内存泄露的问题，如果存在内存泄露，那么程序就会越用越卡。

** 关于静态方法和成员方法的使用，在github的practic1final有简单的说明

** 开发的过程分为：
* 需求分析--项目设计--开发实现--功能测试--部署实施--项目运营和维护

* 需求分析：角色 产品经理 ui
* 项目设计：项目经理和架构师 
* ...
* 功能测试 分为黑盒测试和白盒测试，单元测试，集成测试。


*** IDEA 开发工具的下载和使用：
IntelliJ IDEA：
https://www.jetbrains.com/
Other versions：其他版本
在官网里面找到IntelliJ IDEA
两种开发工具的版本对比：
https://www.jetbrains.com/products/compare/?product=idea&product=idea-ce

安装时：
1. 纯英文的路径
2. 只要勾选Create Desktop Shortcut( 创建快捷方式 )和 
Update PATH Variable(restart needed)添加到path环境变量下

卸载IDEA:
1. 先在设置里面找到程序然后找到卸载，卸载IntelliJ IDEA
2. 在本地的此电脑--C盘--用户(或者an..)--shkstart--AppData--local--JetBrains（ 删除这个文件 ）
3. 在本地的此电脑--C盘--用户(或者an..)--shkstart--AppData--Roaming--JetBrains（ 删除这个文件 ）
这样就彻底卸载。

** 对idea的设置进行一些认识：
* 1. file( 文件 ) -- project Structure...( 项目结构 ) 在这里可以设置指定版本的jdk，也可以设置编译器输出的位置放在那（ Compiler output ），
* 2. 设置默认打开最近关闭的项目：file( 文件 ) --settings..(设置)--外观与行为--系统设置--勾选中启动时重新打开项目
* 3. 关闭自动更新：file( 文件 ) --settings..(设置)--外观与行为--更新--检查版本的更新关闭，其他的开启。
* 4. 设置壁纸： file( 文件 ) --settings..(设置)--外观与行为--外观--找到ui选项，然后下面有一个背景图片。
* 5. 设置滚轮放大字体： file( 文件 ) --settings..(设置)-- General（常规）-- change font...（使用ctrl+鼠标滚轮改变字体大小）的选项框
* 6. 设置注释字体的颜色： 文件--设置--编辑器--配色方案--语言默认值--注释。
* 7. 代码只能提示功能：输入小写的math价格点就能提示他的方法。正常需要大写才行：
file( 文件 ) --settings..(设置)-- General（常规）-- 代码补全 区分大小写取消勾选。
* 8. 动态导包： file( 文件 ) --settings..(设置)-- General（常规）-- 自动导包 ： 然后吧动态明确import和动态优化import勾上
* 9 **. 重要的：设置utf-8： file( 文件 ) --settings..(设置)-- 文件编码：然后吧全局编码和项目编码换成utf-8，还有一个属性文件默认编码也换成utf-8，最后一个找到自动转成Ascii但显示原生内容也勾选上。
* 10 . 设置通用的文件头 ：文件--设置--编辑器-- 文件和代码模板 -- lnclude ：
推荐使用：
/**
* ClassName: ForInd
* Package: PACKAGE_NAME
* Description:
*
* @author: Lizt0816
* @Create 2023/10/12 18:03
* @version: 1.0
*/
11 . 清除双击shift弹窗搜索键。
file( 文件 ) --settings..(设置)--高级设置--搜索double，然后禁用双击修改快捷键
*** idea项目结构：
** 层级关系，最顶级project（ 工程 ） -- module（ 模块，你的各个创建的项目名称就叫模块，有相互依赖的叫模块，没有相互依赖就叫小项目 ）-- package（ 包 ）-- class类
12 . 当想接入新模块的话，
** 两个方法：
1. 需要引入新的模块，但是此时idea还不认识这个模块，需要在： 文件--项目结构中 找到一个+ 号，然后添加指定文件为模块，然后确认确认确认就行了
2. 方法二简单一些，直接新建一个文件，然后把模块的src复制下来粘贴到新模块就行了。
13 . 指定文件使用指定的编码：设置--编辑器--文件编码 找到一个+号，然后添加指定文件，然后在右边有个编码，可以指定编码格式。

*** 数组：Array 1维数组
* 声明和初始化 ： 
* 1. : int[] arr = new int[]{12,45,12}; // 初始化值为{}内部
* 2. : int[] arr = new int[4]; // 初始化值为长度是4的四个null
* 3. 类型推断： int arr = {1,2,3,4,}
* 调用指定元素 
* arr[0] // 获取到1
* arr[0] = 11; // 复制
* arr[12345]; // 报错：指针异常
* 数组的长度：
* arr.length
* 数组的遍历
* for() // 和js一样
* 数组元素的默认初始化值
* 整型的默认初始化值： 是：0 int[] arr = new int[3]; // 初始化的时候都是0
* 浮点型默认初始化值： 是：0.0 double[] arr = new double[3]; // 初始化的时候都是0.0
* 字符串默认初始化值： 是：0 char[] arr = new char[3]; // 初始化的时候都是0
* 布尔类型的初始化值： 是 false boolean[] arr = new arr[3]; // fasle
* 引入数据类型初始化值： null ， String也是引用数据类型
* 数组的内存解析 （ 难 ）
* 将内存区域划分为5个部分： 程序计数器，虚拟机栈，本地方法栈，推，方法区
* 虚拟机栈（ 栈 ）：用于存放变量的地方
* 堆：用于存放数组数据的实体


* 在数组存字符串的时候，字符串存在了字符串常量值中。3
* 当arr2 = arr的时候，arr2的值指向的是arr，所以两个改变的值都是一样的。
* 也就是说：arr2 就相当于 arr
* 数组长度可以通过变量来决定: int a = 10; int[] arr = new int[a];

二维数组：
int[][] monthData = new int[][] {{23,24,22},{54,56,78}}
类型推断写法： int monthData[][] = {{23,24,22},{54,56,78}}
静态写法：int[][] arr = new int[2][2]; 

数组中的数组被指向时，打印出来是地址值。但是取值还是没问题。
解释大概关系
ini[][] arr = new int[4][]; // 
arr[0] // null
arr[0][0] // 报错

二维数组内存解析：



int[][] arr1 = new int[3][2];
byte byte1 = new byte[];
想使用byte1 = arr1; 必须要 arr1 满足纬度和类型才能赋值；

// 克隆数组
int[] arr1 = new int[]{1,2,4,65};
int[] arr2 = new int[arr1.length];
for (int i = 0; i <arr1.length; i++) {
arr2[i] = arr1[i]+1;
System.out.println("新值："+arr1[i]);
}

// 创建一个 Object 数组 对象数组
Object[] objectArray = new Object[5]; 
// 向数组中存储不同类型的对象
objectArray[0] = "Hello"; 
objectArray[1] = 42; 
objectArray[2] = 3.14; 
objectArray[3] = true; 
objectArray[4] = new MyClass();

Object 数组的 toString 方法：
Object[] objectArray = {1, "two", 3.0, true}; 
System.out.println(Arrays.toString(objectArray)); 
// 输出：[1, two, 3.0, true]
基本数据类型数组的 toString 方法：
int[] intArray = {1, 2, 3, 4, 5}; 
System.out.println(Arrays.toString(intArray)); 
// 输出：[1, 2, 3, 4, 5]



面向对象：
大纲：
java类及成员：
属性，方法，构造器； 代码块 ， 内部类

对象对象特征：
封装，继承，多态， 抽象

其他关键字：
this，super，package，import，static，final，interface，abstract


属性：
String name; // 品牌
double price; // 价格

** 方法：
  public void call(){
     // void 表示没有返回值
  }
  public String call(){
  // String 返回字符串
      return "返回字符串"
  }
  public int call(){
    // int 表示返回int 类型
    return 1
  }
  public int[] call(int[] arr){
    // int 表示返回int 类型的数组
    return arr;
  }
  方法的声明格式：
  修饰符 返回值类型 方法名 [throws 异常类型] (){}

** 修饰符：public ... 目前 都使用public 。
   返回值类型：void( 无 )， 
   方法名: 就是当前方法的名称。
   方法的重载：overload
   也就是说，方法名相同，不过形参名和参数类型不一样，就叫重载。

** 可变个数形成的方法：
  在调用方法时候，形参的类型是确认的，但是参数的数量不确定。
  调用方法：  fun(int ... num)
  public void fun(int i,int ... num){
     System.out.println(num[0]+"124578");
  }
  在sql中，案例：
  修改案例：sql 语句
  String sql = "updata customers set name = ?,email = ? where id = ?";
  public void update(String sql,Object ... objs);

*** 重点： 方法值传递机制：
  基本数据类型，赋值操作 都是直接赋值，然后变成一个新的值；
  int a = 1；
  int b = a；
  a++； // 这个时候b 还是1；
  引用数据类型：
  int[] arr = new arr[]{1,2,3}
  int[] arr1 = arr;
  arr[0] = 5;  // 这个时候arr1的0下标也是5
  方法形成和实参传递参数： 
  传基本数据类型：
  和基本数据类型一样
  传引用数据类型


 






















.....