class ForWhileDoWhile{
   public static void main(String[] args){
     // for(int i = 0; i < 5;i++){
     //  System.out.println(i);
     // }

     // int i = 0;
     // while (i < 50) {
     //   System.out.println(i);
     //   i++;
     // }
     
     // 先执行一遍在进行判断在执行
     // int i = 0;   //
     // do{
     //  System.out.println(i);
     //  i++;
     // }while(i < 3);

     // System.out.println('i');



     // 外循环制行，内循环控制列，打印星星
     /*
      * * * * * * *  
       * * * * * *
        * * * * *
         * * * *
           * *
     */

     // for (int i = 1; i <= 4; i++) {
     //  for (int j = 1; j <= 2 * i ; j++) {
     //   System.out.print(' ');
     //  }
     //  for (int k = 0; k <= 9-2*i; k++) {
     //   System.out.print("* ");
     //  }
     //  System.out.println();
     // }
     // 九九乘法表
     // for (int i = 1; i <= 9; i++) {
     //  for (int j = 1; i >= j ; j++) {
     //     System.out.print(j+"*"+i+"="+i*j+"\t");
     //  }
     //  System.out.println();
     // }

     // break 和 continue 
     /**
      * break 是结束当前的循环
      * continue 是马上进入下一次循环
      * 
     */

      // 质数 ：只能被1和他本身整除的自然数,也叫因数,如 3 不能被整除 ，4 可以被整除 因为2*2就是4
      // 方法一
      // int count = 0;
      // for (int i = 2; i <= 100; i++) {
      //  boolean isFlag = true;
      //  for (int j = 2; j < i; j++) {
      //   if(i % j == 0){
      //    isFlag = false;
      //   }
      //  }
      //  if(isFlag){
      //   count++;   // 总数
      //   System.out.println(i);
      //  }
      // }


      // 方法二
      // 优化
      // 观察时间的消耗
      long start = System.currentTimeMillis();
      int count = 0;
      for (int i = 2; i <= 100000; i++) {
       boolean isFlag = true;
       // Math.sqrt 装成平方根  如9 就等于 3
       for (int j = 2; j <= Math.sqrt(i); j++) {
        if(i % j == 0){
         isFlag = false;
         break;
        }
       }
       if(isFlag){
        count++;   // 总数
       }
      }
      long end = System.currentTimeMillis();

      System.out.println(count);
      System.out.println("消耗了的时间为:" + (end - start));
   }
}