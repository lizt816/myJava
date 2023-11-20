## 1.  JAVA

 `使用的是java17版本`



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

在选择版本方面，比较好的是Java Phone ，其次是Java 8，但是在Spring框架中，发布说需要把基准线调整到为17，学习还是已17 为准，17版本的趋势会越来越明显。

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































....学习java：
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

在选择版本方面，比较好的是Java Phone ，其次是Java 8，但是在Spring框架中，发布说需要把基准线调整到为17，学习还是已17 为准，17版本的趋势会越来越明显。

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
* char c1 = 'a'; // 只能存放一个字符 并且只能用单引号

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

*** 字符串类型：String 只能用双引号 ""
字符串相当于多个char组成的。
字符串转数字：
String str9 = "20";
int myInt = Integer.parseInt(str9);
System.out.println(myInt+10); // 打印为30

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




















....学习java：
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

在选择版本方面，比较好的是Java Phone ，其次是Java 8，但是在Spring框架中，发布说需要把基准线调整到为17，学习还是已17 为准，17版本的趋势会越来越明显。

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
* char c1 = 'a'; // 只能存放一个字符 并且只能用单引号

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

*** 字符串类型：String 只能用双引号 ""
字符串相当于多个char组成的。
字符串转数字：
String str9 = "20";
int myInt = Integer.parseInt(str9);
System.out.println(myInt+10); // 打印为30

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
  Math.random();    // 返回double值 ，所以需要使用double类型接收
  double MyRandom = Math.random();  // 返回0-1之间的值 
  *** 在github的java练习中 ReandomTest.java 有星光的例子
































....