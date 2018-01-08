/**
 * Project Name:dt59mehomework
 * File Name:TestThread2.java
 * Package Name:Hw20180108
 * Date:2018年1月8日下午3:31:45
 * Copyright (c) 2018, bluemobi All Rights Reserved.
 */

package Hw20180108;
/**
 * Description:   <br/>
 * Date:     2018年1月8日 下午3:31:45 <br/>
 * @author   YangKui
 * @version
 * @see
 */
public class TestThread2 {

    public static void main(String[] args) {
        for (int i = 0; i < 3; i++) {
        MyThread2 mt=new MyThread2("张三");
        MyThread2 mt1=new MyThread2("李四");
        new Thread(mt).start();
        new Thread(mt1).start();
        
        }
    }

}

