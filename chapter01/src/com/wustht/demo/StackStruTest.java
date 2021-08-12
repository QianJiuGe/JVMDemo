package com.wustht.demo;

/**
 * @Author HuangTao
 * @Description //TODO 
 * @Date 16:46 2021/8/10
 * @Param 
 * @return 
 **/
public class StackStruTest {
    public static void main(String[] args) {
        int i = 2;
        int j = 3;
        int k = i + j;

        /**
         * 反编译 .class文件后：
         *          0: iconst_2     //获取一个常量2
         *          1: istore_1     //存到栈位置1中
         *          2: iconst_3
         *          3: istore_2
         *          4: iload_1      //加载出1位置的数
         *          5: iload_2
         *          6: iadd         //相加操作
         *          7: istore_3
         *          8: return
         */


        try {
            Thread.sleep(6000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        System.out.println("thread end");
    }
}
