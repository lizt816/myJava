class GuLiAccount {
 public static void main(String[] args){

  // 静态方法的使用
  char s = Utility.readMenuSelection();
  System.out.println("选择错误，请重新输入："+s);


  // 成员方法的使用
  Utility Utility = new Utility();
  int ss = Utility.add(5,9);
  int myiii = Utility.myiii();
  
  System.out.println("选择错误，请重新输入222："+ss);
  System.out.println("选择错误，请重新输入myiii："+myiii);
 }
}
