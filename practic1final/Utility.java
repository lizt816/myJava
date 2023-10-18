class Utility {

 int iii = 456789;

 // 静态方法
 public static char readMenuSelection(){
  char c = '1';
  System.out.println("选择错误，请重新输入：");
  return c;
 }


 // 成员方法 可以返回实例里面的数据，静态方法不行，只能运行一次就结束
 public int myiii(){
  return iii;
 }

 // 成员方法
 public int add(int a,int b){
   int i = a + b;
   return i;
 }

}
