/**
 * Project Name:dt59mehomework
 * File Name:TestThread.java
 * Package Name:Hw20180108
 * Date:2018年1月8日下午2:24:03
 * Copyright (c) 2018, bluemobi All Rights Reserved.
 */

package Hw20180108;

import org.apache.log4j.Logger;

/**
 * Description: <br/>
 * Date: 2018年1月8日 下午2:24:03 <br/>
 * 
 * @author YangKui
 * @version
 * @see
 */
public class TestThread {
    private final static Logger LOG = Logger.getLogger(TestThread.class);

    public static void main(String[] args) {
        MyThread mt = new MyThread();
        MyThread mt1 = new MyThread();
        mt1.setPriority(Thread.MAX_PRIORITY);
        mt.setPriority(Thread.MIN_PRIORITY);
        mt.start();
        mt1.start();
    }

}
