package dt59homework;
/**
 * Project Name:dt59homework
 * File Name:paixu.java
 * Package Name:dt59homework
 * Date:2017�?2�?3日下�?:29:01
 * Copyright (c) 2017, bluemobi All Rights Reserved.
 */



/**
 * Description: <br/>
 * Date: 2017�?2�?3�?下午1:29:01 <br/>
 * 
 * @author Administrator
 * @version
 * @see
 */
public class paixu {

    public static void main(String[] args) {

        // Auto-generated method stub
        int[] ary = new int[] { 12, 45, 3, 94, 78 };
        for (int i = 0; i < 5 - 1; i++) {
            for (int j = 0; j < 5 - 1 - i; j++) {//
                if (ary[j] < ary[j + 1]) {

                } else {// 如果当前数比下个数小就交换位
                    int a = ary[j];
                    ary[j] = ary[j + 1];
                    ary[j + 1] = a;
                }
            }
        }
        for (int q = 0; q < ary.length; q++) {
            System.out.println(ary[q]);

        }
    }

}
